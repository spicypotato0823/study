#include <stdio.h>
#include <stdlib.h>


typedef struct ListNode
{
    int data;
    struct ListNode* next;
} ListNode;


ListNode* insert_first(int data, ListNode* head)
{
    ListNode* p = (ListNode*)malloc(sizeof(ListNode));
    p->data = data;
    p->next = head;

    return p;
}

//p->next = pre->next, pre->next = p;
void insert(ListNode* pre, int data)
{
    if(pre == NULL) return;

    ListNode * p = (ListNode*)malloc(sizeof(ListNode));
    p->data = data;
    p->next = pre->next;
    pre->next = p;

    return;
}

ListNode* delete_first(ListNode* head)
{
    if(head == NULL) exit(1);

    ListNode * removed = head;
    head = head->next;

    free(removed);
    
    return head;
}

void delete(ListNode* pre)
{
    if(pre->next == NULL) return;
    ListNode * removed = pre->next;
    pre->next = removed->next;
    free(removed);

}

    

void print_node(ListNode* head)
{
    ListNode* cur = head;
    printf("[head] -> ");
    while (cur != NULL)
    {
        printf("%d -> ", cur->data);
        cur = cur->next;
    }
    printf("NULL\n");
    return;
}

int main(void)
{
    ListNode * head = NULL;
    
    head = insert_first(10, head);
    print_node(head);
    
    head = insert_first(20, head);
    print_node(head);

    head = insert_first(30, head);
    print_node(head);

    insert(head, 25);
    print_node(head);

    head = delete_first(head);
    print_node(head);

    delete(head->next);
    print_node(head);
    
    return 0;
}