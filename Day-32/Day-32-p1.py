'''
Raju is given an Binary rows of numbers(0/1).
He applies the following rules,
Rule1-Changing the row [ 1 1 0] will give [ 0 1 1]
Rule2-Interchange 1-0/0-1

Apply the above two rules and give raju a new binary rows

input=3 3
1 1 0
1 0 1
0 0 0
output=1 0 0
0 1 0
1 1 1

The first line of input contains the numbers of the row followed by each individual row size followed by row elements

'''
#solution
def covert(mat,n,m,t):
    temp=[]
    for i in mat:
        temp.append(i[::-1]) #flipping-the-matrix. 
    for i in range(n):
        for j in range(m):
            if temp[i][j]==0:    #interchanging-the---0-1/1-0
                temp[i][j]=1
            elif temp[i][j]==1:
                temp[i][j]=0
    return temp
if __name__=="__main__":
    n,m=map(int,input().split())
    mat=[]
    t=[1,1,0]
    for i in range(n):
        a=list(map(int,input().split()))[:m]
        mat.append(a)
    print(covert(mat,n,m,t))