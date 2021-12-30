'''
Bablu is working in a construction field.
He has N number of building blocks, where the height and width of all the blocks are same.
And the length of each block is given in an array, blocks[].

Bablu is planned to build a wall in the form of a square.
The rules to cunstruct the wall are as follows:
	- He should use all the building blocks.
	- He should not break any building block, but you can attach them with other.
	- Each building-block must be used only once.
	
Your task is to check whether Bablu can cunstruct the wall as a square
with the given rules or not. If possible, print true. Otherwise, print false.

Input Format:
-------------
Line-1: An integer N, number of BuildingBlocks.
Line-2: N space separated integers, length of each block.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
6
1 2 6 4 5 6

Sample Output-1:
----------------
true


Sample Input-2:
---------------
6
5 3 2 5 5 6

Sample Output-2:
----------------
false
'''

#SOLUTION

'''
NAVIE WAY:
n=int(input())
l=list(map(int,input().split()))[:n]
if sum(l)%4==0:
    print("true")
else:
    print("false")
'''


def SquareBlocks(l):
    target = sum(l)     
    if target % 4 != 0:
        return False
    target=target//4
    size=[0]*4
    l.sort(reverse=True)
    def backtrack(i):
        if i == len(l):
            return True
        for j in range(4):
            if l[i]+size[j]<=target:
                size[j]=size[j]+l[i] 
                if backtrack(i+1):
                    return True   
                size[j]=size[j]-l[i]     
        return False
    return backtrack(0)
n=int(input())
l=list(map(int,input().split()))[:n]
if __name__=="__main__":
    print(SquareBlocks(l))
    
    
'''
#java solution
import java.util.*;
public class Test{
    public static boolean work(int nums[]){
        
                int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        if(nums.length == 0 || nums == null || sum%4 != 0) {
            return false;
        }
        int target = sum / 4;
        boolean[] used = new boolean[nums.length];
        return makesquareHelper(nums , used , 0 , target , 0 , 4);
    }
    
    public static boolean makesquareHelper(int[] nums , boolean[] used , int curSum , int target , int start , int k) {
        if(k == 1) return true;
        if(curSum == target) {
            return makesquareHelper(nums , used , 0 , target , 0 , k-1);
        }
        for(int i = start ; i < nums.length ; i++) {
            if(used[i]) continue;
            used[i] = true;
            if(makesquareHelper(nums , used , curSum + nums[i] , target , i+1 , k)) {
                return true;
            }
            used[i] = false;
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean visit[]=new boolean[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(work(arr));
    }
    
    
}
'''