#include "voca.h"

int main()
{
    WordNode* my_voca = NULL;
    int choice = 0;

    char temp_word[30];
    char temp_meaning[100];

    load_from_file(&my_voca);

    while(1)
    {
        printf("\n=== Voca Master ===\n");
        printf("1. 단어 추가\n");
        printf("2. 단어장 보기\n");
        printf("3. 단어 테스트\n");
        printf("4. 종료\n");
        printf("선택: ");

        scanf("%d", &choice);
        while (getchar() != '\n');
        
        if(choice == 1)
        {
            printf("단어: ");
            scanf("%s", temp_word);
            while (getchar() != '\n');

            printf("의미: ");
            scanf("%s", temp_meaning);
            while (getchar() != '\n');

            append_word(&my_voca, temp_word, temp_meaning);
        }

        if(choice == 2)
        {
            print_words(my_voca);
        }

        if(choice == 3)
        {
            printf("단어 테스트를 시작합니다. \n");
            test_meaning(my_voca);
        }

        if(choice == 4)
        {
            printf("프로그램 종료.\n");
            save_to_file(my_voca);
            break;
        }

    }

    free_all(my_voca);
    

    return 0;
}
