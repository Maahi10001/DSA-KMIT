/*
Student Groups.

In a college, differents students groups conducted a survery, to find out 
which group has the biggest count of students in a student group. 

Students has a status of 1/0.
If there is 1 it means there are connected with each other.
If 0 they are not connected. 

Few Students those who are not intrested to join any group they break the 
chain by making the status 0 . This way there will be n number of student groups.

Students are connected either horizontally, vertically or diagonally 
with each other and they form a student-group. 
There may be zero or more student-groups.

The Student Union Groups want to know the biggest student group.

You will ge given M,N Groups whose status is either 0/1

Sample Input-1:
---------------
5 4
0 0 1 1
0 0 1 0
0 1 1 0
0 1 0 0
1 1 0 0

Sample Output-1:
----------------
8


Sample Input-2:
---------------
5 5
0 1 1 1 1
0 0 0 0 1
1 1 0 0 0
1 1 0 1 1
0 0 0 1 0

Sample Output-2:
----------------
5

In the above example we have 3 students groups
first group has 5 
second group has 4 
third group has 3 

Among those the first group has the maximum students so print 5  

*/
import java.util.*;
class program{
    public static int dfs(int[][] grid,int i,int j,int m,int n){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]==0){
            return 0;
        }
        int count=1;
        grid[i][j]=0;
        count+=dfs(grid,i+1,j,m,n);
        count+=dfs(grid,i-1,j,m,n);
        count+=dfs(grid,i,j+1,m,n);
        count+=dfs(grid,i,j-1,m,n);
        count+=dfs(grid,i+1,j+1,m,n);
        count+=dfs(grid,i-1,j+1,m,n);
        count+=dfs(grid,i-1,j-1,m,n);
        count+=dfs(grid,i+1,j-1,m,n);
        return count;
        
    }
    public static int helper(int [][]grid,int m,int n){
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    count=Math.max(count,dfs(grid,i,j,m,n));
            }
        }
        return count;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int grid[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.print(helper(grid,m,n));
    }
}