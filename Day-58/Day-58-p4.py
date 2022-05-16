'''Given a sorted integer array nums, where the range of elements are in the inclusive range [lower, upper], return its missing ranges.
Example:
Input: nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99,
Output: ["2", "4->49", "51->74", "76->99"]

input format:
input =
5
0 1 3 50 75
0
99
output =
2
4->49
51->74
76->99

first line reads the size of array elements
second line reads the elements
third and fourth lines read lower value and upper values from the user.

'''
def getranges(size,nums):
    ranges=[]
    if(size==0):
        return ranges
    x=res[0]
    for i in range(size):
        if(i==size-1 or nums[i]+1!=nums[i+1]):
            if(nums[i]!=x):
                ranges.append(str(x)+"->"+str(nums[i]))
            else:
                ranges.append(str(x))
            if(i!=size-1):
                x=nums[i+1]
    return "\n".join(map(str,ranges))               
if __name__=="__main__":
    n=int(input())
    nums=list(map(int,input().split()))
    up=int(input())
    down=int(input())
    res=[]
    for i in range(up,down+1):  #...generating a list with all elements from up to down boundary
        res.append(i)
    for i in nums: #...removing the elements which are in nums from generated list
        if(i in res):
            res.remove(i)
    print(getranges(len(res),res))  #...passing the left out elements for ranges
    
  '''
  import java.util.*;
class program{
    
    public static List<String> helper(int n,int[] nums, int lb, int ub)
    {
        List<String> al = new ArrayList<String>();
        int next = lb;
        for (int i = 0; i < n; i++) 
        {
            if (nums[i] < next) 
            {
                continue;
            }
            if (nums[i] == next) 
            {
                next++;
                continue;
            }
            al.add(getRange(next, nums[i] - 1));
            next = nums[i] + 1;
        }
        if (next <= ub) 
        {
            al.add(getRange(next, ub));
        }
        return al;
        
    }
         
        private static String getRange(int n1, int n2) {
            return n1 == n2 ? String.valueOf(n1) : String.format("%d->%d" , n1, n2);
        }
        public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int lower=sc.nextInt();
        int upper=sc.nextInt();
        System.out.print(helper(n,nums,lower,upper));
    }
} 


  '''  