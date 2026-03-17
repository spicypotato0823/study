#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct stack
{
    int num[10000];
    int pivot;

}stackType;

void initStack(stackType * S)
{
    S->pivot = -1;
}

void push(stackType * S, int data)
{
    S->pivot++;
    S->num[S->pivot] = data;
}

int pop(stackType * S)
{
    if(S->pivot == -1)
    {
        return -1;
    }

    int data = S->num[S->pivot];
    S->pivot--;
    return data;
}
int isEmpty(stackType * s)
{
    if(s->pivot == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int size(stackType * S)
{
    if(isEmpty(S))
    {
        return 0;
    }
    return S->pivot + 1;
}

int top(stackType * S)
{
    if(isEmpty(S))
    {
        return -1;
    }

    return S->num[S->pivot];
}

int main(void)
{
    stackType * stack = (stackType*)malloc(sizeof(stackType));
    initStack(stack);
    int n;
    scanf("%d", &n);

    for(int i = 0; i < n; i++)
    {
        char str[10];
        scanf("%s", str);

        if(!strcmp(str, "push"))
        {
            int num;
            scanf("%d", &num);
            push(stack, num);

        }
        else if(!strcmp(str, "pop"))
        {
            printf("%d\n", pop(stack));
        }
        else if(!strcmp(str, "size"))
        {
            printf("%d\n", size(stack));
        }
        else if(!strcmp(str, "empty"))
        {
            printf("%d\n", isEmpty(stack));
        }
        else
        {
            printf("%d\n", top(stack));
        }
    }

    free(stack);
    return 0; 
}

