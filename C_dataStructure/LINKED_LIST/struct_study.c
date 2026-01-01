#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Warrior 
{
    char name[20];
    int hp;
    int attack;
} Warrior;

int main() 
{
    Warrior W1;
    strcpy(W1.name, "전사 1");
    W1.hp = 100;
    W1.attack = 10;
    //W1는 stack에 생성
    printf("[스택] 이름: %s, 체력: %d\n", W1.name, W1.hp);

    Warrior* W2 = (Warrior*)malloc(sizeof(Warrior));
    strcpy(W2->name, "전사 2");
    W2->hp = 200;
    W2->attack = 10;
    //W2는 heap에 생성, ->로 접근

    printf("[힙] 이름: %s, 체력: %d 공격력 : %d\n", W2->name, W2->hp, (*W2).attack);


    free(W2);

    return 0;









}
