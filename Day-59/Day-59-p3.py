'''Given array with 0's and 1's, your task is to find out the number of contiguous
arrays can be formed ,which contains more number of the 1's


input =5
1 0 1 1 0
output =9

Explanation:
------------
The Contiguous subarrays having more ones than zeros are as follows:
with size-1: [1], [1], [1]
With size-2: [1,1]
With size-3: [1,0,1], [0,1,1], [1,1,0]
With size-4: [1,1,0,1]
With size-5: [1,1,0,1,0]


'''
def count_contigous(n,nums):
    count=0
    for j in range(n):
        i=0
        j=j+1
        while(j<=n):
            temp=nums[i:j]
            #print(temp)
            if(temp.count(1)>temp.count(0)):
                count+=1
            i+=1
            j+=1
    return count
if __name__=="__main__":
    n=int(input())
    nums=list(map(int,input().split()))[:n]
    print(count_contigous(n,nums))