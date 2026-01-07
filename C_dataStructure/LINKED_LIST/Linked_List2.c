#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Node
{
    int data;
    struct Node* next;    
}Node;

Node* create_Node(int num)
{
    Node* New_node = (Node*)malloc(sizeof(Node));
    New_node->data = num;
    New_node->next = NULL;

    return New_node;
}

Node* append_Node(Node* head, int num)
{
    Node* new_node = create_Node(num);

    if(head == NULL)
    {
        return new_node;
    }
    
    Node* curr = head;

    while(curr->next != NULL)
    {
        curr = curr->next;
    }

    curr->next = new_node;

    return head;

}


Node* insert_at(Node* head, int index, int num)
{
    Node* new_node = create_Node(num);
    Node* prev_node = head;

    if(index == 0)
    {
        new_node->next = head;
        return new_node;
    }
    
    for(int i = 0; i < index - 1; i++)
    {        
        if(prev_node->next == NULL)
        {
            prev_node->next = new_node;
            return head;
        }

        prev_node = prev_node->next;

    }

    new_node->next = prev_node->next;
    prev_node->next = new_node;
    return head;
}

void free_all(Node* head)
{
    Node* curr = head;
    Node* next_node = NULL;

    while(curr->next != NULL)
    {
        next_node = curr->next;
        
        free(curr);

        curr = next_node;
    }
}

void print_Node(Node* head)
{
    Node* curr = head;
    int Node_num = 1;

    printf("[start]\n");
    
    while(curr != NULL)
    {
        printf("%d번 노드의 data : %d\n", Node_num, curr->data);

        Node_num++;
        curr = curr->next;
    }

    printf("[END]\n");
}


int main()
{
    Node* head = NULL;

    head = append_Node(head, 10);
    head = append_Node(head, 20);
    head = append_Node(head, 30);
    head = append_Node(head, 40);
    head = append_Node(head, 50);
    head = append_Node(head, 60);

    printf("노드 출력 시작\n");

    print_Node(head);

    head = insert_at(head, 0, 0);
    head = insert_at(head, 4, 400);
    head = insert_at(head, 40, 40000);

    printf("수정노드 출력 시작\n");

    print_Node(head);


    free_all(head);

    return 0;
}

