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

NodeType* InsertHead(NodeType* head, int data)
{
    NodeType* new_node = CreateNode(data);
    if(head == NULL)
    {
        return new_node;
    }

    new_node->next = head;
    head->prev = new_node;
    return new_node;   
}

NodeType* InsertTail(NodeType* head, int data)
{
    NodeType* new_node = CreateNode(data);
    if(head == NULL)
    {
        return new_node;
    }

    NodeType* curr = head;
    while (curr->next != NULL)
    {
        curr = curr->next;
    }
    
    new_node->next = curr->next;
    curr->next = new_node;
    new_node->prev = curr;

    return head;
}

void DeleteNode(NodeType** head, NodeType* target)
{
    if(target == NULL || head == NULL) return;

    if(target == *head)
    {
        *head = target->next;
    }
    
    if(target->next != NULL)
    {
        target->next->prev = target->prev;
    }

    if(target->prev != NULL)
    {
        target->prev->next = target->next;
    }

    free(target);
    return;


}

void PrintList(NodeType* head)
{
    if(head == NULL) return;

    NodeType* curr = head;
    printf("[head] -> ");
    while (curr != NULL)
    {
        printf("[%d] -> ", curr->data);
        curr = curr->next;
    }
    printf("[NULL]\n");
    return;
    
}
int main(void)
{
    NodeType * head = NULL;
    head = InsertHead(head, 10);
    head = InsertTail(head, 20);
    head = InsertTail(head, 30);
    head = InsertTail(head, 40);

    PrintList(head);

    DeleteNode(&head, head->next);

    PrintList(head);

    DeleteNode(&head, head);

    PrintList(head);
    
    return 0;
}