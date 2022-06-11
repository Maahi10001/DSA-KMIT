/*Given an array and k , find largest sum of subsequence of nums of length k from array

Return any such subsequence as an integer array of length k.

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

 
input =4
2 1 3 3 
2
output =3 3
The subsequence has the largest sum of 3 + 3 = 6.

input =4
-1 -2 3 4
3
output =-1 3 4
The subsequence has the largest sum of -1 + 3 + 4 = 6.

input =4
3 4 3 3
2
output =3 4
The subsequence has the largest sum of 3 + 4 = 7. 
Another possible subsequence is 4 3.

*/
import java.util.*;
class Test{
    public static ArrayList<Integer> subseq_sum(int[] a,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
         ArrayList<Integer>res=new ArrayList<>();
         Set<Integer>set=new HashSet<>();
         for(int i=0;i<a.length;i++)
         {
             pq.offer(a[i]);
             if(pq.size()>k){
                 
                 pq.poll();
             }
         }
         while(!pq.isEmpty()) {
             int temp= pq.poll();
             res.add(temp);
         }
       
         return res;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.print(subseq_sum(arr,k));
    }
}