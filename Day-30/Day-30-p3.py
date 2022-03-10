'''
The municipal corporation of hyd is planning to conduct a voting survey, 
they are getting confused with the common names in the given list. 
The concerned officer finds the few characters of the names same and removes them. 
Help the officer to find the same characters that begin with the same name

The first line of input contains the number of voters names followed by voters names

If no such thing exists print -1

input = 3
apple ape april
output = ap


input = 4
abhishake abhignya abhinayni abhiram
output=abhi
'''
#solution
def getsimiliar(arr):
    x=len(min(l, key=len))
    res=""
    for i in range(x):
        arr=l[0][i]   #check for a
        g=True
        for j in l:    #check for apple
            if j[i]!=arr:  
                g=False
        if g:
            res=res + arr
    if len(res)==0:
        return "-1"
    else:
        return res
if __name__=="__main__":
    n=int(input())
    l=list(input().split())[:n]
    print(getsimiliar(l))