'''
You will be given a word 'w' and a group of words 'g'. 

check if 'w' can be broken into a space separated characters of one or more in the given group of words 'g'

Note the same word in the group of words may be re used multiple times in the breaking. 

The first line of input contains the group of words(g) followed by a word(w)

if it can done print true else print false

input=fleet gold
fleetgold
output=true

Explanation: prints true because fleetgold  can be broken as fleet gold

input=apple pen
applepenapple
output=true

Explanation: print true because "applepenapple" can be broken as "apple pen apple".
Note that you are allowed to reuse group of words

input=cats dogs and and cat
catsandog
output=false
'''
#solution
def func(s,w):
    n=len(s)
    dp=[False for i in range(n+1)]
    dp[0]=True
    for i in range(1,n+1):
        for j in w:
            if dp[i-len(j)] and s[i-len(j):i]==j:
                dp[i]=True
    return dp[-1]
if __name__=="__main__":
    w=list(map(str,input().split()))
    s=input()
    if(func(s,w)):
        print("true")
    else:
        print("false")