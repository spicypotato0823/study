#include <stdio.h>
#include <stdlib.h>

typedef struct NodeType
{
    int data;
    struct NodeType * next;
    
}NodeType;

NodeType* CreateNode(int data)
{
    NodeType* new_node = (NodeType*)malloc(sizeof(NodeType));
    new_node->data = data;
    new_node->next = NULL;
    
    return new_node;
}

NodeType* InsertFirst(NodeType* tail, int data)
{
    NodeType* new_node = CreateNode(data);

    if(tail == NULL)
    {
        new_node->next = new_node;
        return new_node;
    }

    new_node->next = tail->next;
    tail->next = new_node;
    return tail;
}


NodeType* InserLast(NodeType* tail, int data)
{
    NodeType* new_node = CreateNode(data);

    if(tail == NULL)
    {
        new_node->next = new_node;
        return new_node;
    }

    new_node->next = tail->next;
    tail->next = new_node;
    return new_node;
}

void FreeAll(NodeType* tail)
{
    if(tail == NULL) return;

    NodeType* free_node = tail->next;
    NodeType* next_node;

    tail->next = NULL;
    while (free_node != NULL)
    {
        next_node = free_node->next;
        free(free_node);
        free_node = next_node;
    }
    
    
    
}

void PrintCircular(NodeType* tail)
{
    NodeType* curr = tail->next;

    if(tail == NULL)
    {
        printf("List is empty!\n");
        return;
    }
    printf("[head] -> ");
    do 
    {
        printf("[%d] -> ", curr->data);
        curr = curr->next;

    } while (curr != tail->next);

    printf("[End (Back to Start)]\n");

}

int main(void)
{
    NodeType* tail = NULL;

    tail = InsertFirst(tail, 10);
    tail = InsertFirst(tail, 20);

    tail = InserLast(tail, 5);
    PrintCircular(tail);
    
    FreeAll(tail);

    return 0;
}