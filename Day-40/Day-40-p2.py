'''
ajith is playing a game to find a words ,if he found the word return true othere wise return false.

for example:

input =
3 3
a b c
d e a
l m t
cat
output =true

Note: 
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells 
are horizontally or vertically neighboring. The same letter cell may not be used more than once.


example:2
input =3 4
a b c e
s f c s
a d e f
abcced
output =true


input =3 4
a b c e
s f c s
a d e e
see
output =true

input =4 4
a b c d
e f g h
i j k l
m n o p
abcdhlkjfm
output =false



'''
#solution


def findtheword(arr,s):
    x=len(arr)
    y=len(arr[0])
    res=set()
    
    
    def dfsword(i,j,idx):
        if i<0 or i>=x or j<0 or j>=y or idx>=len(s) or arr[i][j]!=s[idx] or (i,j) in res:
            return False
        if idx==len(s)-1 :
            return True
        res.add((i,j))
        one,two=dfsword(i+1,j,idx+1),dfsword(i-1,j,idx+1)
        three,four=dfsword(i,j+1,idx+1),dfsword(i,j-1,idx+1)
        res.remove((i,j))
        return one or two or three or four
        
        
        
    for i in range(x):
        for j in range(y):
            if arr[i][j]==s[0]:
                if dfsword(i,j,0):
                    return True
    
if  __name__=="__main__":
    n,m=map(int,input().split())
    mat=[]
    for i in range(n):
        a=list(map(str,input().split()))[:m]
        mat.append(a)
    s=input()
    if(findtheword(mat,s)):
        print("true")
    else:
        print("false")
