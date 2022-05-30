/*
Given the binary representation of an integer as a string s , return the number of steps to reduce it to 1 under
the following rules:
	• If the current number is even, you have to divide it by 2 .
	• If the current number is odd, you have to add 1 to it.
It is guaranteed that you can always reach one for all test cases.

input =1101
output =6

s = "1101"
Explanation: "1101" corressponds to number 13 in their decimal representation.
Step 1) 13 is odd, add 1 and obtain 14.
Step 2) 14 is even, divide by 2 and obtain 7.
Step 3) 7 is odd, add 1 and obtain 8.
Step 4) 8 is even, divide by 2 and obtain 4.
Step 5) 4 is even, divide by 2 and obtain 2.
Step 6) 2 is even, divide by 2 and obtain 1.

input =10
output =1

s = "10"
Explanation: "10" corressponds to number 2 in their decimal representation.
Step 1) 2 is even, divide by 2 and obtain 1.

Input: s = "1"
Output: 0

*/
import java.util.*;
class program{
    public static int no_of_steps(String s){
        int count=0;
        int n=Integer.parseInt(s,2);
        while(n!=1){
            if(n%2==0){
                n/=2;
                count++;
            }
            else{
                n++;
                count++;
            }
        }
    return count;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(no_of_steps(s));
    }
}