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

int main()
{
    StackType STACK1;
    init_Stack(&STACK1);    

    push(10, &STACK1);
    push(20, &STACK1);
    push(30, &STACK1);
    push(40, &STACK1);

    printf("%d\n",peek(&STACK1));
    
    printf("%d\n", pop(&STACK1));
    printf("%d\n", pop(&STACK1));
    printf("%d\n", pop(&STACK1));
    printf("%d\n", pop(&STACK1));



    return 0;
}