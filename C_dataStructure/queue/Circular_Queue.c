#include <stdio.h>
#include <stdlib.h>

#define MAX_QUEUE_SIZE 5

typedef struct QueueType{
    
    int data[MAX_QUEUE_SIZE];
    int rear;
    int front;

}QueueType;

void init_queue(QueueType * Q)
{
    Q->rear = 0;
    Q->front = 0;
}

int is_empty(QueueType * Q)
{
    if(Q->front == Q->rear)
    {
        return 1;
    }
    else
    {
        return 0;
    }

// rear과 front가 같을 경우 공백상태
}

int is_full(QueueType * Q)
{
    if(Q->front == ((Q->rear + 1) % MAX_QUEUE_SIZE))
    {
        return 1;
    }
    else
    {
        return 0;
    }
// rear가 front보다 한 칸 앞에 있을 경우 포화상태
// 원형 큐에서 배열 한 칸을 비워두는 이유는 공백 상태와 포화 상태를 구별하기 위함. 
}

void enqueue(int data, QueueType * Q)
{
    if(is_full(Q))
    {
        printf("Queue is full\n");
        exit(1);
    }

    Q->rear = (Q->rear + 1) % MAX_QUEUE_SIZE;
    Q->data[Q->rear] = data; 
    
    return;
}

int dequeue(QueueType * Q)
{
    if(is_empty(Q))
    {
        printf("Queue is empty\n");
        exit(1);
    }

    Q->front = (Q->front + 1) % MAX_QUEUE_SIZE;
    return Q->data[Q->front];
}

void print_data(QueueType * Q)
{
    for(int i = 0; i < MAX_QUEUE_SIZE; i++)
    {
        printf("[data %d] : %d\n", i, Q->data[i]);
    }

    return;
}

void print_queue(QueueType * Q) 
{
    printf("Q->front : %d , Q->rear : %d", Q->front, Q->rear);
    //front + 1 부터    rear 까지 
    if(is_empty(Q))
    {
        printf("queue is empty!\n");
        return;
    }

    int i = Q->front;

    do {
        i = (i + 1) % MAX_QUEUE_SIZE;
        printf("data : %d | ", Q->data[i]);

        if(i == Q->rear) break;
    } while (i != Q->rear);
    
    printf("\n");


    return;
}

int main(void)
{
    QueueType queue1;

    init_queue(&queue1);

    print_queue(&queue1);
    print_data(&queue1);
}