#include "voca.h"



//단어 노드 생성
WordNode* create_word(char* word, char* meaning)
{
    WordNode* new_node = (WordNode*)malloc(sizeof(WordNode));
    if (new_node == NULL)
    {
        printf("메모리가 부족합니다.");
        return NULL;
    }

    strcpy(new_node->word, word);
    strcpy(new_node->meaning, meaning);
    new_node->next = NULL;
    return new_node;

}

void append_word(WordNode** head, char* word, char* meaning)
{
    WordNode* new_node = create_word(word, meaning);

    if(*head == NULL)
    {
        *head = new_node;
        return;
    }

    WordNode* curr = *head;
    while (curr->next != NULL)
    {   
        curr = curr->next;
    }
    curr->next = new_node;

}

void print_words(WordNode* head)
{
    if(head == NULL)
    {
        printf("단어장이 비어있습니다.\n");
        return;
    }

    printf("==== [my voca note] ====\n");
    int count = 1;
    WordNode* curr = head;

    while (curr->next != NULL)
    {
        printf("%d. %s : %s\n", count++, curr->word, curr->meaning);
        curr = curr->next;
    }

     printf("%d. %s : %s\n", count++, curr->word, curr->meaning);
    
     printf("=========================\n");

return;

}

void free_all(WordNode* head)
{
    WordNode* curr = head;
    WordNode* next_node = NULL;
    
    while(curr != NULL)
    {
        next_node = curr->next;
        free(curr);
        curr = next_node;
    }


    return;
}

void save_to_file(WordNode* head)
{
    FILE* fp = fopen("voca.txt", "w");
    if (fp == NULL)
    {
        printf("파일 열기 실패!\n");
        return;
    }

    WordNode* curr = head;     

    while(curr != NULL)
    {
        fprintf(fp, "%s %s\n",curr->word, curr->meaning);
        curr = curr->next;
    }

    printf("파일 저장이 완료되었습니다.\n");
    fclose(fp);
}

void load_from_file(WordNode** head)
{
    FILE* fp = fopen("voca.txt", "r");
    
    if (fp == NULL) 
    {
        printf("[알림] 저장된 단어장이 없습니다. 새로 시작합니다.\n");
        return;
    }

    char temp_word[30];
    char temp_meaning[100];
    // fscanf는 읽어온 데이터 개수를 반환합니다. (성공하면 2, 실패하거나 끝이면 EOF)
    while(fscanf(fp, "%s %s", temp_word, temp_meaning) == 2)
    {
        append_word(head,temp_word,temp_meaning);

    }

    printf("불러오기 완료\n");
    fclose(fp);
}



void test_meaning(WordNode* head)
{
    WordNode* curr = head;
    char temp_meaning[100];
    

    int wrong = 0;
    int right = 0;

    while(curr != NULL)
    {

        printf("%s : ", curr->word);

        scanf("%s", temp_meaning);
        while (getchar() != '\n');

        if (strcmp(temp_meaning, curr->meaning) == 0)
        {
            printf("\n정답입니다!\n");
            right++;
        }
        else
        {
            printf("\n땡! 정답은 : %s입니다!\n", curr->meaning);
            wrong++;
        }
        
        curr = curr->next;
        
        
    }

    printf("\n총 문제 개수 : %d\n맞은 개수 : %d\n틀린 개수 : %d", wrong+right, right, wrong);
}