/*

Linked List - Display names from the Specified n 

write a program to print all the names from the number specified  n 
Note - Use recursion only. 

Print all the elements from the number specified (N)

Assume n >=1 and <= Length of the Linked list

input=ram
shyam
tom
shiva
gopi
nagraju
3
output =
tom
shiva
gopi
nagraju

*/
#include <stdio.h>
#include<stdlib.h>
#include<string.h>
struct Name{
    char names[100];
    struct Name* next;
    
}*head;
struct Name *temp=NULL;
void intoarr(char *names){
    struct Name *n=(struct Name *)malloc(sizeof(struct Name));
    strcpy(n->names,names);
    if(head==NULL){
        head=n;
        temp=head;
    }
    else{
        n->next=NULL;
        temp->next=n;
        temp=n;
    }
    //intoarr(names);
}
void result(struct Name* head,int num){
    if(head==NULL) return;
    if(num<=1){
        printf("%s\n",head->names);
    }
    result(head->next,num-1);
}
int main()
{
    int n;
    scanf("%d",&n);
    head=NULL;
    char names[100];
    for(int i=0;i<n;i++){
      scanf("%s",names);
      intoarr(names);
    }
    int num;
    scanf("%d",&num);
    result(head,num);
    return 0;
}