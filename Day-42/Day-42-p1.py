'''
Given an integer m and array characters, return the maximum number of consecutive B's in the array if you can
change at most m A's.


input =11
B B B A A A B B B B A
2
output=6

Explanation: B B B A A B B B B B B
5th index and 10th index were flipped from A to B. The longest subarray is 5th index to 10th index are having consecutive B's. so return length 6


input =19
A A B B A A B B B A B B A A A B B B B
3
output =10
Explanation: A A B B B B B B B B B B A A A B B B B
index 4th , 5th and 9th index  were changed from A to B. The longest subarray is from 2nd index to 11th index. so return length 10

'''
#solution
def flips(n,l,m):
    i=0
    j=i+1
    a=[]
    while(j<=n):
        sb=l[i:j+1]
        x=sb.count("A")
        if(x==m):
            length=len(sb)
            a.append(length)
        j+=1
        if(j==n):
            i+=1
            j=i+1
    if(len(a)!=0):
        return max(a)
    return n
        
if __name__=="__main__":
    n=int(input())
    l=list(map(str,input().split()))[:n]
    m=int(input())
    print(flips(n,l,m))