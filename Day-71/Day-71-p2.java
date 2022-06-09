/*
given an array and two integers n1 and n2, find the sum of all the numbers between n1th and n2th smallest elements of that array
Note: don't use sort method 

ex:
input =6
1 3 12 5 15 11
3 
6
output =23
after sorting 1 3 5 11 12 15
n1= 3 ie 3rd smallest number is 5 
n2=6 ie 6th smallest number is 15
The sum of numbers between 5 and 15 is 23 (11+12). 

input =4
3 5 8 7
1
4
output =12
n1=1 ie 1st smallest number is 3
n2=4 ie 4th smallest number is 8
The sum of the numbers between is 12(5+7).


*/
import java.util.*;
class Test
{
   public static int getSum(PriorityQueue<Integer>pq,int num1,int num2)
   // public static int getSum(int[]a,int num1,int num2)
    {
        int sum=0;
        int temp=1;
      // num1-=1;
      // num2-=1;
       //int id1=0;
       //int id2=0;
       //Arrays.sort(a);
    //   for(int i=0;i<a.length;i++){
    //       if(num1==i){
    //           id1=i;
    //       }
    //       if(num2==i){
    //           id2=i;
    //       }
    //   }
    //   for(int i=id1+1;i<id2;i++){
    //       sum+=a[i];
    //   }
    while(!pq.isEmpty() && temp<num2){
        int value=pq.poll();
        if(temp>num1){
            sum+=value;
        }
        temp++;
    }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> p = new PriorityQueue<>();
       //int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            //arr[i]=sc.nextInt();
            p.add(sc.nextInt());
        }
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(getSum(/*arr*/ p,n1,n2));
    }
 
}