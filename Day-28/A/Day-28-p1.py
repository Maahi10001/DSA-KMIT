'''Ramu is given an group of scores and a special number k, 
Now his teacher asked him to find the pairs(a,b) where a<b such that
scores[a]-scores[b]==k. 
The absolute diff should be equal to k 

If no such pairs exists print 0
The first line of input contains the size of the scores followed by the scores followed by a special number k 

input =4
4 5 5 4
1
the pairs which match the above condition
[4 5 5 4]
The pairs are as follows 
[4 5]
[4 5]
[5 4]
[5 4]


input = 5
4 3 2 6 5
2
output = 3
The pairs are as follows 
[4 2]
[4 6]
[3 5]
'''
#solution
def work(arr,n,k):
    count=0
    for i in range(0,n):
        for j in range(i+1,n):
            if(abs(arr[i]-arr[j])==k):
                count+=1
    return count
            
    return count            
if __name__=="__main__":
    n=int(input())
    arr=list(map(int,input().split()))[:n]
    k=int(input())
    print(work(arr,n,k))
    