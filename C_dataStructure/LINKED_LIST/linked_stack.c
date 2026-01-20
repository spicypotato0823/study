#include <stdio.h>
#include <stdlib.h>


typedef struct NodeType
{
    int data;
    struct NodeType* next;
    struct NodeType* prev;
}NodeType;


NodeType* CreateNode(int data)
{
    NodeType* new_node = (NodeType*)malloc(sizeof(NodeType));
    new_node->data = data;
    new_node->next = NULL;
    new_node->prev = NULL;
    
    return new_node;
}

int IsEmpty(NodeType* top)
{
    if(top == NULL)
    {
        return 1;
    }
    return 0;
}

void Push(NodeType** top, int data)
{
    NodeType* new_node = CreateNode(data);

    if(IsEmpty(*top))
    {
        *top = new_node;
        return;
    }

    (*top)->prev = new_node;
    new_node->next = *top;
    *top = new_node;
    return;
}
int Pop(NodeType** top)
{   
    if(IsEmpty(*top))
    {
        printf("stack is empty!\n");
        return 0;
    }
    int pop_data = (*top)->data;
    NodeType* free_node = *top;

    *top = (*top)->next;
    if(*top != NULL)
    {
        (*top)->prev = NULL;
    }
    free(free_node);

    return pop_data;

}

int Peek(NodeType** top)
{
    if(IsEmpty(*top)) 
    {   
        printf("stack is empty\n");
        return 0;
    }

    return (*top)->data;
}

int main(void)
{
    NodeType* top = NULL;
    
    Push(&top, 10);
    Push(&top, 20);
    Push(&top, 30);

    printf("Current Top : %d\n", Peek(&top));

    while (!IsEmpty(top))
    {
        printf("Popped : %d\n", Pop(&top));
    }
    
    Pop(&top);


    return 0;
}