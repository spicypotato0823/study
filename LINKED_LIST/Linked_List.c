#include <stdio.h>
#include <stdlib.h>


typedef struct Node 
{
    int data;
    struct Node* next;
} Node;

// typedef를 통해 struct Node를 Node로 바꿈
// 구조체 사용시, 일반 변수는 Node.data로 표현, 포인터는 Node->next로 표현

int main(void)
{
    Node* head = (Node*)malloc(sizeof(Node));
    head->data = 10;
    head->next = NULL;

    Node* node2 = (Node*)malloc(sizeof(Node));
    node2->data = 20;
    node2->next = NULL;

    head->next = node2;

    printf("첫번째 노드 값 : %d\n", head->data);
    printf("두번째 노드 값 : %d\n", (head->next)->data);
    
    free(head);
    free(node2);
    










    return 0;
}