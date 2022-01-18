'''

Sundeep is working with integer sets.
He is given a set of integers nums[], consist of positive integers.
You have to find a subsequence of integet set nums[], where the sum of elements
is equal to the sum of the rest of the elements.

Check whether you are able to split the entire set nums[], into two subsequences
where the two subsequences never share the elements from same index.

If it is possible to split, print true.
otherwise print false.

The first line of input contains the size followed by array elements 

Sample Input-1:
---------------
4
4 2 8 6

Sample Output-1:
----------------
true

Explanation:
----------
[4,6] and [2,8] sum of both the sets equal to 10.


Sample Input-2:
---------------
5
2 3 4 5 8

Sample Output-2:
----------------
false


'''
#solution
def justifypair(nums,n):
    if not nums:
        return True
    if sum(nums)%2 !=0:
        return False
    t=sum(nums)//2
    dp=[False for _ in range(t+1)]
    dp[0]=True
    for num in nums:
        for j in range(t,num-1,-1):
            dp[j]=dp[j] or dp[j-num]
        if dp[t]:
            return True
    return False
if __name__=="__main__":
    n=int(input())
    nums=list(map(int,input().split()))[:n]
    if(justifypair(nums,n)):
        print("true")
    else:
        print("false")
    