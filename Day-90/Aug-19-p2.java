/*
Somu is given few numbers and he is supposed to give the count of the number of 
sub-numbers that have an odd product.

input = 5 1 2 3 4
output = 4

the sub-numbers with odd product are [5],[1],[3],[5,1]    
the count of those numbers is 4. 

the first line of input contains the group of numbers 
*/

import java.util.*;
class program{
    public static int work(int []arr,int n){
        int count=0,last=-1,k=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                k=(i-last-1);
                count+=(k*(k+1)/2);
                last=i;
            }
        }
        k=(n-last-1);
        count+=(k*(k+1)/2);
        return count;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        String s=sc.nextLine();
        String a[]=s.split(" ");
        int []arr=new int[a.length];
       // System.out.print(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            arr[i]=Integer.parseInt(a[i]);
        }
        System.out.print(work(arr,arr.length));
        
    }
}