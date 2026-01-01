#include <stdio.h>
#include <stdlib.h>

#define MAX_STACK_SIZE 100

typedef struct StackType
{
    int top;
    int data[MAX_STACK_SIZE];

}StackType;
void init_Stack(StackType * S)
{
    S->top = -1;
}

int is_full(StackType * S)
{
    if(S->top == MAX_STACK_SIZE - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int is_empty(StackType * S)
{
    if(S->top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void push(int item, StackType * S)
{
    if(is_full(S) == 1)
    {
        printf("STACK is FULL\n");
        return;
    }
    else
    {
        S->data[++S->top] = item;
        return;
    }
}

int pop(StackType * S)
{
    int item = 0;
    if(is_empty(S) == 1)
    {
        printf("STACK is empty\n");
        exit(1);
    }
    else
    {
        item = S->data[S->top];
        S->top--;
        return item;
    }
}

int peek(StackType * S)
{
    if(is_empty(S) == 1)
    {
        exit(1);
    }
    else
    {
        return S->data[S->top];    
    }
}

int check_matching(const char *in)
{
    StackType Bracket;
    init_Stack(&Bracket);

    int i = 0;

    while (in[i] != '\0')
    {
        if(in[i] == '(')
        {
            printf("1\n");
            push(1, &Bracket);
        }
        else if(in[i] == ')')
        {
            if(is_empty(&Bracket))
            {
                return 0;
            }

            if(peek(&Bracket) == 1)
            {
                pop(&Bracket);
            }
            else
            {
                return 0;
            }
        }
        else if (in[i] == '{')
        {
            printf("2\n");
            push(2, &Bracket);
        }
        else if(in[i] == '}')
        {
            if(is_empty(&Bracket))
            {
                return 0;
            }
            if(peek(&Bracket) == 2)
            {
                pop(&Bracket);
            }
            else
            {
                return 0;
            }
        }

        else if (in[i] == '[')
        {
            printf("3\n");
            push(3, &Bracket);
        }
        else if(in[i] == ']')
        {
            if(is_empty(&Bracket))
            {
                return 0;
            }
            if(peek(&Bracket) == 3)
            {
                pop(&Bracket);
            }
            else
            {
                return 0;
            }
        }

        i++;
    }

    if(Bracket.top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }

}

int main()
{
    char input[100] = "{(A+1) == (c+1)}";
    
    if(check_matching(input))
    {
        printf("NICE\n");
    }
    return 0;
}