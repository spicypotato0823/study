#include <stdio.h>
#include <stdlib.h>

#define MAX_DEQUE_SIZE 10

typedef struct DequeType
{
    int data[MAX_DEQUE_SIZE];
    int front;
    int rear;
}DequeType;

void init_Deque(DequeType * Deque)
{
    Deque->front = 0;
    Deque->rear = 0;

    return;
}

int is_empty(DequeType * Deque)
{
    if(Deque->rear == Deque->front)
    {
        printf("Deque is empty!\n");
        return 1;
    }
    return 0;
}

int is_full(DequeType * Deque)
{
    if(Deque->rear == (Deque->front + 1) % MAX_DEQUE_SIZE)
    {
        printf("Deque is full\n");
        return 1;
    }
    return 0;
}

//전단에서 컨트롤은 front활용, 후단에서 컨트롤은 rear활용.
//front는 항상 비어있는 칸을 가리킨다.
//front -> 입력 후 이동
//rear는 항상 마지막 데이터가 있는 칸을 가르킨다.
//rear -> 이동 후 입력



void add_front(int data, DequeType * deque)
{
    if(is_full(deque))
    {
        return;
    }
    
    deque->data[deque->front] = data;
    deque->front = (deque->front + MAX_DEQUE_SIZE - 1) % MAX_DEQUE_SIZE;
    
    return;
}

int delete_front(DequeType * deque)
{
    if(is_empty(deque))
    {
        exit(1);
    }

    deque->front = (deque->front + 1) % MAX_DEQUE_SIZE;
    return deque->data[deque->front];
}

int get_front(DequeType * deque)
{
    if(is_empty(deque))
    {
        exit(1);
    }

    return deque->data[(deque->front + 1) % MAX_DEQUE_SIZE];
}


void add_rear(int data, DequeType * deque)
{
    if(is_full(deque))
    {
        return;
    }

    deque->rear = (deque->rear + 1) % MAX_DEQUE_SIZE;
    deque->data[deque->rear] = data;

    return; 
}

int delete_rear(DequeType * deque)
{
    if(is_empty(deque))
    {
        exit(1);
    }
    deque->rear = (deque->rear - 1 + MAX_DEQUE_SIZE) % MAX_DEQUE_SIZE; 
    return deque->data[(deque->rear + 1) % MAX_DEQUE_SIZE];
}

int get_rear(DequeType * deque)
{
    if(is_empty(deque))
    {
        exit(1);
    }
    
    return deque->data[deque->rear];

}
void main()
{








    return;
}