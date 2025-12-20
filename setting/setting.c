#include <stdio.h>
#include <stdlib.h>

int main(void)
{
// void malloc(size_t size)
    int arr1[] = {1,2,3,4};
    int a;
    int *arr2 = (int*) malloc(sizeof(int) * 4);

    for(int i = 0; i < 4; i++)
    {
        arr2[i] = arr1[i];
    }

    printf("arr -> %d\n *arr -> %d\n arr[0] -> %d", arr2, *(arr2 + 1), arr2[0]);


    return 0;
}