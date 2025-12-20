#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int cap = 3;
    int new_cap;
    int* arr = (int*) malloc(sizeof(int) * cap);
    int answer;
    int count = 0;


    if(arr == NULL)
    {

        printf("malloc error");

    }  

    
    while (1)
    {
        if(count == cap)
        {
            printf("\n메모리 확장\n");
            
            new_cap = cap * 2;

            int* arr2 = (int*) malloc(sizeof(int) * new_cap);

            for(int i = 0; i < count; i++)
            {

                arr2[i] = arr[i];

            }

            free(arr);
            arr = arr2;
            cap = new_cap;
            
        }

        printf("값을 입력하세요 : ");
        scanf("%d", &answer);
        
        
        if(answer == -1)
        {
            break;
        }

        arr[count] = answer;
        
        for(int i = 0; i <= count; i++)
        {
            printf("arr[%d] = %d\n", i, arr[i]);
        }
        
        count ++;

    }
    

    free(arr);
    
    return 0;

}