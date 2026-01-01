#include <stdio.h>
#include <stdlib.h>

int main(void)
{

    char text1[100] = "abcdefg";
    char text2[100] = "abcdeeee";

    int count = 0;
    int R = 0;

    while (text1[count] != NULL)
    {
        count++;

        if(text1[count] != text2[count])
        {
            printf("WRONG!\n");
            break;
        }
        else
        {
            R++;
        }

    }
    
    if(count == R)
    {
        printf("RIGHT!\n");
    }
     
    printf("R : %d, count : %d", R, count);






    return 0;
}