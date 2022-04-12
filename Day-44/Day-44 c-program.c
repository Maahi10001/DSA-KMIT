/*

Write a C Program to Create a Linked List of Students.

Where Each Student Node Should consists of Rno,Name, Marks.

Create a Linked List of 5 Students. 

Display the Student Data like the following 

Rno Name Marks.

input =
101 Mike 100
99 Scott 98
98 Tom 97
95 Sara 94
102 Zim 91

output =
101 Mike 100
99 Scott 98
98 Tom 97
95 Sara 94
102 Zim 91

*/
#include <stdio.h>
struct Students
{
    int Rno,Marks;
    char Name[50];
}s1[5];
int main()
{
    for(int i=0;i<5;i++){
        scanf("%d",&s1[i].Rno);
        scanf("%s",s1[i].Name);
        scanf("%d",&s1[i].Marks);
    }
    for(int i=0;i<5;i++){
        printf("%d ",s1[i].Rno);
        puts(s1[i].Name);
        printf(" %d",s1[i].Marks);
        printf("\n");
    }
    return 0;
}