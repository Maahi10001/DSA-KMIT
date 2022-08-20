/*
Vinith a fifth class student is given a maths assingment by his school teacher. 

The maths teacher gave the following equations and asked the Vinith to solve for any given 
integer 'n'. 

    f(num)= 1, num=0
    f(num)=f(num-1)-1, if num is odd
    f(num)=f(num-1)+num, if num is even 
    
Assume the number given by the math teacher is always >=0

Help Vinith solve the problem given by his maths teacher 
Use Recursion. 


input=9
outut = 16

input=24
output=125

*/


import java.util.*;
class program{
    public static int evenorodd(int n){
        if(n==1) n=0;
        else if((n&1)==1)
            n=evenorodd(n-1)-1;
        else
            n=evenorodd(n-1)+n;
        return n;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(evenorodd(n));
    }
}