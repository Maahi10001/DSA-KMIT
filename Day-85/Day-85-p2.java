/*
Consider a pair of integers, (a,b). The following operations can be performed 
on (a,b) in any order, zero or more times:
	- (a,b) -> ( a+b, b )
	- (a,b) -> ( a, a+b )

For example, starting with (1,1), perform the operation (1, 1+1) to get (1,2), 
perform the operation (1+2, 2) to get (3,2), and perform the operation (5,2). 
Alternatively the first operation could be (1+1, 1) to et (2,1) and so on.

Your task is to build a function must return a string that denotes whether or not 
you can convert (a,b) to (c,d) by performain zero or more the operations specified above. 

If it is possible, return true, otherwise false.

NOTE: 
1<= a,b,c,d <= 1000

Input Format:
-------------
Line-1: Two space separated integers, a,b
Line-2: Two space separated integers, c,d

Output Format:
--------------
Return a boolean value.


Sample Input-1:
---------------
1 2
5 4

Sample Output-1:
----------------
true


Sample Input-2:
---------------
2 3
10 7

Sample Output-2:
----------------
false
*/
import java.util.*;
class program{
    //static boolean flag=false;
    public static boolean canwereach(int a,int b,int x,int y){
        if(a==x&&b==y){
            return true;
        }
        if(a>x||b>y){
            return false;
        }
        return canwereach(a+b,b,x,y)||canwereach(a,a+b,x,y);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        System.out.print(canwereach(a,b,x,y));
        
    }
}


/*
 to avoid over flow according to lc:-780
 while(x>a&&y>b){
        if(x>y) x%=y;
        else y%=x;
    }
    if(a>x||b>y) return false;
    if(a==x) return (y-b)%a==0;
    if(b==y) return (x-a)%b==0;
    return a==x&&b==y;
    */

