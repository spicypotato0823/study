#include <stdio.h>

# define max_size 100

int heap[max_size];
int heapSize = 0;


void swap(int* num1, int* num2)
{
    int temp = *num1;
    *num1 = *num2;
    *num2 = temp;
}

void push(int data) // 데이터 추가하기, 맨 밑으로 들어가 위로 올라가기(UP-HEAP)
{
    heapSize++;

    heap[heapSize] = data; // 힙 맨 끝에 데이터 추가

    int current = heapSize;
    
    while (current > 1)
    {
        int parent = current / 2;
        if(heap[parent] < heap[current])
        {
            swap(&heap[parent], &heap[current]);
            current = parent;
        }
        else
        {
            break;
        }
    }
    
}

int pop() // 최댓값 삭제 및 반환, 맨 끝 녀석을 올려 아래로 내려가기(DOWN-HEAP)
{
    if (heapSize == 0) return 0;

    int result = heap[1];

    heap[1] = heap[heapSize];
    
    heapSize--;

    int parent = 1;

    while (1)
    {
        int leftChild = parent * 2;
        int rightChild = parent * 2 + 1;
        int largest = parent;

        if(heap[leftChild] > heap[largest] && leftChild <= heapSize)
        {
            largest = leftChild;
        }

        if(heap[rightChild] > heap[largest] && rightChild <= heapSize)
        {
            largest = rightChild;
        }

        if(largest != parent)
        {
            swap(&heap[largest], &heap[parent]);
            parent = largest;
        }
        else break;
    }
    return result;
}


void main(void)
{

    push(30);
    push(50);
    push(100);

    // 기대 결과: 100 -> 50 -> 30 (큰 순서대로)
    printf("%d\n", pop());
    printf("%d\n", pop());
    printf("%d\n", pop());






}