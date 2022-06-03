/*

A professional thief entered into a floor in a building,
The floor has M*N inter connected rooms, the thief can enter into any room 
from any other room. And there are few rooms closed from inside, so the thief 
cannot enter into them. Initially the thief is at room[0][0] and has to exit 
from room[m-1][n-1].

You will be given the array room[][], filled with either 0 or 1.
Here, 1-indiactes a closed room, 0-indiactes a open room.
Your task is to find and print the number of unique escape routes 
from room[0][0] and room[m-1][n-1]. And the thief can move only in 
two directions one is forward direction and other is downward direction.


Input Format:
-------------
Line-1: Two space separated integers, M and N.
Next M lines: N space separated integers, either 0 or 1.

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
3 4
0 0 0 0
0 1 0 0
0 0 1 0

Sample Output-1:
----------------
2


Sample Input-2:
---------------
4 4
0 0 0 0
0 0 1 0
1 0 0 0
0 0 1 0

Sample Output-2:
----------------
3

Hint- USE DP

*/
import java.util.*;
class Test
{
    public static int all_paths(int [][]grid,int m,int n){
       int [][]dp=new int[m][n];
        boolean isob=false;
        for(int i=0;i<n;i++){
            if(isob||grid[0][i]==1){
                isob=true;
                dp[0][i]=0;
            }
            else{
                dp[0][i]=1;
            }
        }
        isob=false;
        for(int i=0;i<m;i++){
            if(isob||grid[i][0]==1){
                isob=true;
                dp[i][0]=0;
            }
            else{
                dp[i][0]=1;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]==1){
                    dp[i][j]=0;
                }
                else
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int grid[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.print(all_paths(grid,m,n));
    }
}

