'''
Given a sorted integer array without duplicates, return the summary of its ranges.

Example 1:
Input:  [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.

input format:
input =
6
0 1 2 4 5 7
output =
0->2
4->5
7
first read the size of the array , followed by elements

Example 2:
Input:  [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.

input = 
7
0 2 3 4 6 8 9
output =
0
2->4
6
8->9




'''

def func(arr,n):
    x=arr[0]
    res=[]
    if(n==0):
        return res
    for i in range(n):
        if(i==n-1 or arr[i]+1!=arr[i+1]):
            if(arr[i]!=x):
                res.append(str(x)+"->"+str(arr[i]))
            else:
                res.append(str(x))
            if(i!=n-1):
                x=arr[i+1]
    return  "\n".join(map(str,res))           
if __name__=="__main__":
    n=int(input())
    arr=list(map(int,input().split()))[:n]
    print(func(arr,n))