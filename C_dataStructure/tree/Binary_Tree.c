#include <stdio.h>
#include <stdlib.h>

typedef struct TreeNode
{
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
} TreeNode;

TreeNode* createNode(int data)
{
    TreeNode* NewNode = (TreeNode*)malloc(sizeof(TreeNode));
    NewNode->data = data;

    NewNode->left = NULL;
    NewNode->right = NULL;
    
    return NewNode;
}


void preorder(TreeNode* root) // 전위 순회 (root -> L -> R)
{
    if(root != NULL)
    {
        printf("[%d] ", root->data);
        preorder(root->left);
        preorder(root->right);
    }
}

void inorder(TreeNode* root) // 중위 순회 (L -> root -> R)
{
    if(root != NULL)
    {
        inorder(root->left);
        printf("[%d] ", root->data);
        inorder(root->right);
    }
}

void postorder(TreeNode* root) // 후위 순회 (L -> R -> root)
{
    if(root != NULL)
    {
        postorder(root->left);
        postorder(root->right);
        printf("[%d] ", root->data);
    }

}

TreeNode* searchNode(TreeNode* root, int key) //Binary Search Tree, BST (Left < Root < Right)
{
    if(root == NULL || root->data == key)
    {
        return root;
    }

    if(root->data < key)
    {
        return searchNode(root->right, key);
    }
    else
    {
        return searchNode(root->left, key);
    }
}

TreeNode* InsertNode(TreeNode* root, int data)
{
    if(root == NULL)
    {
        return createNode(data);
    }

    if(root->data < data)
    {
        root->right = InsertNode(root->right, data);
    }
    else
    {
        root->left = InsertNode(root->left, data);
    }

    return root;

}

void freeNode(TreeNode* root)
{
    if(root != NULL)
    {
        freeNode(root->left);
        freeNode(root->right);
        free(root);
    }
}

int main(void)
{   
    TreeNode* root = NULL;

    root = InsertNode(root, 30);
    root = InsertNode(root, 20);
    root = InsertNode(root, 10);
    root = InsertNode(root, 40);
    root = InsertNode(root, 50);
    root = InsertNode(root, 60);
    root = InsertNode(root, 70);

    printf("pre : ");
    preorder(root);
    printf("\n");
    
    printf("in : ");
    inorder(root);
    printf("\n");

    printf("post : ");
    postorder(root);
    printf("\n");

    return 0;
}