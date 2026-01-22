#include <stdio.h>

int main(void)
{
    int N = 4; // 총 점의 개수
    int n = 2; // 한 변에 점의 개수
    int T = 0;

    scanf("%d", &T);

    for(int i = 0; i < T; i++)
    {
        n = 2 * n - 1;

        N = n * n;

    }

    printf("%d", N);

    return 0;
}