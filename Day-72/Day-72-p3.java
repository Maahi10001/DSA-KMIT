/*
Given an array of numbers print the starting index and ending index of the given element
Note: elements are in sorted order
      print -1 -1 if the element is not found.
      implement algorith with O(log n) runtime complexity.

example:
input =6
5 7 7 8 8 10
8
output =3 4
8 is at 3rd index started  and ended at 4th index 


input =8
1 2 4 4 4 4 6 7 
output =2 5

input =8
1 2 4 4 4 4 6 7
8
output =-1 -1

*/
import java.util.*;
class Test{
    public static List<Integer>  find_first_last(int []nums,int n,int target){
        List<Integer> res=new ArrayList<Integer>();
        res.add(-1);res.add(-1);
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
               res.add(0,mid);
            }
            if(nums[mid]>=target){
                  j=mid-1;  
            }
            else{
                i=mid+1;
            }
        }
        i=0;j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==target){
                res.add(1,mid);
            }
            if(nums[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return res;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }int target=sc.nextInt();
        System.out.print(find_first_last(nums,n,target));
    }
}