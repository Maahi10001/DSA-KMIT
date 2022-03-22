'''
for given number n and k, find out non-negative integers of length n and difference between consecutive digits is k.

for example: 

input =1 0
output =0 1 2 3 4 5 6 7 8 9

length of each number should be 1 and difference betweeen consecutive digits is k ie 1.

input = 2 1
output =10 12 21 23 32 34 43 45 54 56 65 67 76 78 87 89 98

length of each number is n(i.e 2 in this case) and difference between consecutive digits is k ie 1.


input =3 7
output =181 292 707 818 929

length of each number is n(ie 3 in this case) and difference between consecutive digits is k ie 7.



'''
#solution
def digits(n,k):
    a=[]
    if n==1: 
        a.append(0)
    def dfs(dig,n):
        if n==0:
            a.append(dig)
            return
        last_digit=dig%10
        if(last_digit>=k): 
            dfs(dig*10+last_digit-k,n-1)
        if k>0 and last_digit+k<10:
            dfs(dig*10+last_digit+k,n-1)
    for i in range(1,10):
        dfs(i,n-1)
        
    return a
if __name__=="__main__":
    n,k=map(int,input().split())
    print(digits(n,k))