#include <stdio.h>
#include <stdlib.h>

#define MAX_STACK_SIZE 100

typedef struct StackType
{
    int top;
    char data[MAX_STACK_SIZE];

}StackType;

void init_Stack(StackType * S)
{
    S->top = -1;
    // data배열을 수정하지 않고도 top 변수의 값만 -1으로 설정하면 stack에 저장된 기존 값과는 상관없이 stack이 초기화 될 수 있음
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

void push(char item, StackType * S)
{
    if(is_full(S) == 1)
    {
        printf("STACK is FULL\n");
        return;
    }
    else
    {
        S->data[++S->top] = item;
        //printf("stack : %c\n", item);
        return;
    }
}

char pop(StackType * S)
{
    char item;
    if(is_empty(S) == 1)
    {
        printf("STACK is empty\n");
        exit(1);
    }
    else
    {
        item = S->data[S->top--];
        return item;
    }
}

char peek(StackType * S)
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
/*
int eval(const char * exp)
{
    StackType stack1;

    init_Stack(&stack1);
    
    int i = 0;
    int num1 = 0;
    int num2 = 0;
    
    while(exp[i] != '\0')
    {

        if(exp[i] == '*' || exp[i] == '/' || exp[i] == '-' || exp[i] == '+')
        {
            if(is_empty(&stack1) == 1)
            {
                printf("error!\n");
                return 0;
            }
            
            num2 = pop(&stack1);
            num1 = pop(&stack1);

            if(exp[i] == '*')
            {
                printf("%d * %d = %d\n", num2, num1, num1 * num2);
                push(num1 * num2, &stack1);
            }
            else if(exp[i] == '-')
            {
                printf("%d - %d = %d\n", num2, num1, num1 - num2);
                push(num1 - num2, &stack1);
            }
            else if(exp[i] == '+')
            {
                printf("%d + %d = %d\n", num2, num1, num1 + num2);
                push(num2 + num1, &stack1);
            }
            else
            {
                printf("%d / %d = %d\n", num1, num2, num1 / num2);
                push(num1 / num2, &stack1);
            }

        }   

        else if(exp[i] >= '0' && exp[i] <= '9')
        {
            push(exp[i] - '0', &stack1);
            
        }
        else if(exp[i] == ' ')
        {
            i++;
            continue;
        }

        i++;
    }



    return pop(&stack1);
}
*/

int prec(char op)
{
    switch (op)
    {
    case '(' : return 0;
    case '+' : return 1;
    case '-' : return 1;
    case '*' : return 2;
    case '/' : return 2;
    }

    return -1;
}


void infix_to_postfix(const char *exp)
{
    StackType stack1;
    init_Stack(&stack1);

    int i = 0;
    
    while(exp[i] != '\0')
    {
        if(exp[i] >= '0' && exp[i] <= '9')
        {
            printf("%d ", exp[i] - '0');
        }

        else if(exp[i] == '*' || exp[i] == '/' || exp[i] == '-' || exp[i] == '+')
        {
            while(!is_empty(&stack1) && (prec(peek(&stack1)) >= prec(exp[i])))
            {
                printf("%c ", pop(&stack1));
            }

            push(exp[i], &stack1);
        }
        else if(exp[i] == ')')
        {
            while(peek(&stack1) != '(')
            {
                printf("%c ", pop(&stack1));
            }

            pop(&stack1);
        }
        else if(exp[i] == '(')
        {
            push('(', &stack1);
        }

        i++;
    }
    while(!is_empty(&stack1))
    {
        printf("%c ", pop(&stack1));
    }
    return;
}


int main()
{
    char exp[100] = {"(2 + 3) * 4 + 9"};
    infix_to_postfix(exp);
    
    return 0;
}

