'''

Shankar is given a set of N pluck cards, each card labelled with a number on it, and he is also given a difference value as 'D'.
Now Shankar has to find out the length of the largest arithmetic set 'S'.

A subset is called as arithmetic set, iff the difference between the numbers on any two adjacent cards is same as D.

A subset can be derived from the set of N pluck cads by deleting some or no cards without changing the order of the remaining cards.

Input Format:
------------- 
Line-1: Two space separated integers N, D, number of cards, difference.
Line-2: N space separated integers, numbers on the set of cards.

Output Format:
--------------
Print an integer, length of longest arithmetic subset.


input=6 2
1 2 3 4 6 8
output=4

Input=8 -2
8 1 2 6 5 4 2 0 
output=5

'''
#solution
def func(arr,n):
    dp = {}
    for i in arr:
        if i - n in dp:
            dp[i] = dp[i-n] + 1
        else:
            dp[i] = 1
            
    return max(dp.values())
if __name__=="__main__":
    m,n=map(int,input().split())
    arr=list(map(int,input().split()))[:m]
    #arr=list(set(arr))
    print(func(arr,n))