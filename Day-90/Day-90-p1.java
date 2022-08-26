/*Given an array arr[] of size n containing integers. 
find the length of the longest sub-array which is contigous  having sum equal to the given value k.

Examples:

input =10 5 2 7 1 9  
15
output = 4

Explanation -
The sub-array is {5, 2, 7, 1}.

input =-5 8 -14 2 4 12
-5
output = 5

Explanation - The sub-array is  {-5, 8, -14, 2, 4}

For all boundary conditions print -1 
*/

import java.util.*;
class program{
    public static int cont_subarray(int n,int[] arr,int k){
        int ans=0,sum=0,max=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                max=i+1;
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
            if(mp.containsKey(sum-k)){
                max=Math.max(max,i-mp.get(sum-k));
            }
        }
        return max==0?-1:max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String []s=sc.nextLine().split(" ");
        int []arr=new int[s.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        int k=sc.nextInt();
        System.out.print(cont_subarray(arr.length,arr,k));
    }
}