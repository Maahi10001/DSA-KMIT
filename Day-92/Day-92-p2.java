/*

Given five positive integers, 

find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two space-separated long integers.


Sample Input
1 2 3 4 5
Sample Output
10 14

Explanation

Our initial numbers are 1,2,3,4 and 5 . We can calculate the following sums using four of the five integers:

    If we sum everything except 1, our sum is  2+3+4+5 = 14
    If we sum everything except 2, our sum is 1+3+4+5 = 13
    If we sum everything except 3, our sum is 1+2+4+5 = 12
    If we sum everything except 4, our sum is 1+2+3+5 = 11
    If we sum everything except 5, our sum is 1+2+3+4 = 10

As you can see, the minimal sum is 10 and the maximal sum is 14. 

*/

import java.util.*;
class program{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int arr[]=new int[s.length];
        int n=arr.length,sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        System.out.print((sum-max)+" "+(sum-min));
    }
}