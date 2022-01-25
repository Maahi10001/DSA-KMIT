'''
You will be given a area of a matrix. Where the matrix has a
value 1/0. 1 represent the land and 0 represents the water.

The matrix is connected both row and column wise not diagonally. 
the matrix is surronded by water completely and there is exactly 1 island (i.e, 1 or more connected land cells)

The island doesn't have "lakes", meaning the water inside isn't connected to the
water around the island. One cell is a square with side length 1. The matrix is
rectangular,. we have to find  perimeter of the island.


input=4 4
0 1 0 0
1 1 1 0
0 1 0 0
1 1 0 0
output=16

Explanation- The perimeter is the 16 yellow stripes in the image above.
'''
#solution
def func(mat):
    n=len(mat)
    m=len(mat[0])
    c=0
    count=0
    for i in range(len(mat)):
        for j in range(len(mat)):
            if(mat[i][j]==1):
                count+=1
                if(i!=0):
                    c+=mat[i-1][j]
                if(j!=len(mat[i])-1):
                    c+=mat[i][j+1]
                if(i!=len(mat)-1):
                    c+=mat[i+1][j]
                if(j!=0):
                    c+=mat[i][j-1]
    return (4*count)-c
if __name__=="__main__":
    n,m=map(int,input().split())
    mat=[]
    c=0
    for i in range(n):
        a=list(map(int,input().split()))[:m]
        mat.append(a)
    print(func(mat))