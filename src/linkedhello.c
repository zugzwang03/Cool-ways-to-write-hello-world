#include <stdio.h>
#include <stdlib.h>

struct Node {
     char data;
	struct Node* next;
};

void printList(struct Node* n)
{
    while (n != NULL) {
        printf(" %c ", n->data);
        n = n->next;
    }
}

int main()
{
    struct Node* h = NULL;
    struct Node* e = NULL;
    struct Node* l = NULL;
    struct Node* ltwo = NULL;
    struct Node* o = NULL;
    struct Node* space=NULL;
    struct Node* w = NULL;
    struct Node* otwo = NULL;
    struct Node* r = NULL;
    struct Node* lthree = NULL;
    struct Node* d = NULL;
    
   

    h = (struct Node*)malloc(sizeof(struct Node));
    e = (struct Node*)malloc(sizeof(struct Node));
    l = (struct Node*)malloc(sizeof(struct Node));
    ltwo = (struct Node*)malloc(sizeof(struct Node));
    o = (struct Node*)malloc(sizeof(struct Node));
    space = (struct Node*)malloc(sizeof(struct Node));
    w = (struct Node*)malloc(sizeof(struct Node));
    otwo = (struct Node*)malloc(sizeof(struct Node));
    r = (struct Node*)malloc(sizeof(struct Node));
    lthree = (struct Node*)malloc(sizeof(struct Node));
    d = (struct Node*)malloc(sizeof(struct Node));

    h->data='h';
    h->next=e;

    e->data='e';
    e->next=l;

    l->data='l';
    l->next=ltwo;

    ltwo->data='l';
    ltwo->next=o;

    o->data='o';
    o->next=space;

    space->data=' ';
    space->next=w;

    w->data='w';
    w->next=otwo;

    otwo->data='o';
    otwo->next=r;

    r->data='r';
    r->next=lthree;

    lthree->data='l';
    lthree->next=d;

    d->data='d';
    d->next=NULL;


     printList(h);








return 0;
}


    