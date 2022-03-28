'''
1
1 1
2 1
1 2 1 1
1 1 1 2 2 1
3 1 2 2 1 1
1 3 1 1 2 2 2 1
1 1 1 3 2 1 3 2 1 1
3 1 1 3 1 2 1 1 1 3 1 2 2 1
1 3 2 1 1 3 1 1 1 2 3 1 1 3 1 1 2 2 1 1


Printing the number based on its previous frequencies i.e for n n-1 freqience pattern #leetcode Count and say problem btw not copied ok.

'''
#solution
def pattern(n):
    if n==1: return "1"
    temp=pattern(n-1)
    res,count="",1
    for i in range(len(temp)):
        if i==len(temp)-1 or temp[i]!=temp[i+1]:
            res+=str(count)+temp[i]
            count=1
        else:
            count+=1
    return res
if __name__=="__main__":
    n=int(input())
    print(pattern(n))