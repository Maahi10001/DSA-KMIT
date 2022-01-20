'''

Ramu is given an array of numbers now he has to check for a super square matrix in the given array.

A super square matrix is a matrix such that every row sum, every column sum, and both
diagonal sums are all equal. 

The integers in the magic square do not have to be distinct. 
Every 1 x 1 grid is trivially a super square matrix 

Given an m x n integer grid , return the size (i.e., the side length k ) of the largest super square matrix that can be found
within this grid.



Example 1:

Input = 
4 5
7 1 4 5 6
2 5 1 6 4
1 5 4 3 2
1 2 7 3 4
Output: 3

Explanation: 

From the above array we have the following super square matrix of size 3 
5 1 6 
5 4 3
2 7 3 



The largest super square matrix has a size of 3.
Every row sum, column sum, and diagonal sum of this magic square is equal to 12.
- Row sums: 5+1+6 = 5+4+3 = 2+7+3 = 12
- Column sums: 5+5+2 = 1+4+7 = 6+3+3 = 12
- Diagonal sums: 5+4+3 = 6+4+2 = 12



'''
#solution
def func(grid):
    m,n=len(grid),len(grid[0])
    dp=[[(0,0,0,0)]* (n+1) for _ in range(m+1)]
    for i in range(1,m+1):
        for j in range(1,n+1):
            dp[i][j]=[ 
                dp[i][j-1][0]+grid[i-1][j-1],
                dp[i-1][j][1]+grid[i-1][j-1],
                dp[i-1][j-1][2]+grid[i-1][j-1],
                 (dp[i-1][j+1][3] if j<n else 0)+grid[i-1][j-1],    
                ]
    for k in range(min(m,n),0,-1):
        for i in range(k,m+1):
            for j in range(k,n+1):
                val=dp[i][j][2]-dp[i-k][j-k][2]                                                   #major diagonal
                if dp[i][j-k+1][3]-(dp[i-k][j+1][3] if j+1<=n else 0)!=val: continue              #minor diagonal
                if any(dp[row][j][0]-dp[row][j-k][0] !=val for row in range(i,i-k,-1)): continue# for each row
                if any(dp[i][col][1]-dp[i-k][col][1] !=val for col in range(j,j-k,-1)): continue # for each column
        
                return k
    return 1
if __name__=="__main__":
    n,m=map(int,input().split())
    a=[]
    for i in range(n):
        b=list(map(int,input().split()))
        a.append(b)
    print(func(a))