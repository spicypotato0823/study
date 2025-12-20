#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int cap = 3;
    int* arr = (int*) malloc(sizeof(int) * cap);
    int answer;
    int count = 0;


    if(arr == NULL)
    {

        printf("malloc error");

    }  

    
    while (1)
    {
        printf("값을 입력하세요 : ");
        scanf("&d", &answer);
        
        if(answer == -1)
        {
            break;
        }
        else
        {
            count++;
        }  

        arr[count - 1] = answer;
        
        printf("%d", arr[count - 1]);
    }
    






    free(arr);
    
    return 0;

}