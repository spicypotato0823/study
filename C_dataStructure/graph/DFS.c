#include <stdio.h>

#define SIZE 4

int graph[SIZE][SIZE] = 
{
    {0, 1, 1, 0},
    {1, 0, 0, 1},
    {1, 0, 0, 0},
    {0, 1, 0, 0}
};

/*
  [2번]
    |
  [0번] ── [1번] ── [3번]
-> 이를 인접행렬로 표현
*/
int visited[SIZE] = {0, }; 

//DFS 재귀함수
void dfs(int current) 
{
    
    visited[current] = 1; // 갔던 곳으로 돌아가지 않게 온 곳은 체크
    printf("%d번 -> ", current);

    for (int next = 0; next < SIZE; next++) 
    {
        if (graph[current][next] == 1 && visited[next] == 0) 
        {    
            dfs(next); 
        }
    }
}

int main(void) 
{
    printf("DFS 탐색 시작\n");
    
    // 0번 사람부터 탐색 출발
    dfs(0); 
    
    printf("끝!\n");
    return 0;
}