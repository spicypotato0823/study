#include <stdio.h>

#define SIZE 4 

// 💡 핵심: 두 번째 대괄호에 반드시 크기(SIZE)를 명시할 것!
// int graph[][4] 또는 int graph[SIZE][SIZE] 둘 다 가능해.
void addEdge(int graph[][SIZE], int a, int b) 
{
    graph[a][b] = 1;
    graph[b][a] = 1;
}

int main(void) 
{
    
    int graph[SIZE][SIZE] = {0, }; // 0으로 배열 초기화

    
    addEdge(graph, 0, 1);
    addEdge(graph, 0, 2);
    addEdge(graph, 1, 3);

    printf("  0 1 2 3\n");
    printf(" ---------\n");
    for (int i = 0; i < SIZE; i++) 
    {
        printf("%d|", i);

        for (int j = 0; j < SIZE; j++) 
        {
            printf("%d ", graph[i][j]);
        }
        
        printf("\n");
    }

    return 0;
}