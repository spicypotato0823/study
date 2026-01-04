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
        printf("stack : %d\n", item);
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
        item = S->data[S->top--];
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

        if(exp[i] >= '0' && exp[i] <= '9')
        {
            push(exp[i] - '0', &stack1);
            
        }

        i++;
    }



    return pop(&stack1);
}

int main()
{
    char exp[100] = {"8 2 / 3 - 3 2 * +"};

    printf("answer is : %d\n", eval(exp));
    
    return 0;
}

