#ifndef VOCA_H
#define VOCA_H

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// 단어 하나를 나타내는 구조체(노드)
typedef struct WordNode

{
    char word[30];
    char meaning[100];
    struct WordNode* next;
} WordNode;

// 기본 기능들을 함수로 구현
WordNode* create_word(char* word, char* meaning);
void append_word(WordNode** head, char* word, char* meaning);
void print_words(WordNode* head);
void free_all(WordNode* head);
void save_to_file(WordNode* head);
void load_from_file(WordNode** head);
void test_meaning(WordNode* head);
#endif