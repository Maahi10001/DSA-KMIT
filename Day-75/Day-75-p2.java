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
*/

/*approach-using dp
 as it has given only go right or down
 so for all edges  of grid where x=0 and y=0 there will only one way to go that is either right when x=0
 and only down while y=0 so filling the grid with all "1's" when x=0 and y=0
 when x and y are not zero either other grids in array then there previous grid sum will we added x-1,y + x,y-1
 every thing similar to unique path 1
 but when there is an objstacle found before any row or cols marks it as true and fil it wiht 1 ,so the the rows and column behind obstacle are not able to visited so fill them as 0s else fill them as 1s
 if there are not rows and cols behind objstacle qe just fill the obstacles cell as 1 where 1 in cell indicates unreachable
 and at last count all the values by this previous values if any cell is 1 replace its value with 0 saying not reahcbale and rest of them with sum of their previous row and col.
 
 and thats it simple.
 */
import java.util.*;
class program {
    public static int no_of_paths(int[][] rooms,int m,int n) {
        int [][]dp=new int[m][n];
        boolean isclose=false;
        for(int i=0;i<n;i++){
            if(isclose||rooms[0][i]==1){
                isclose=true;
                dp[0][i]=0;
            }
            else{
                dp[0][i]=1;
            }
        }
        isclose=false;
        for(int i=0;i<m;i++){
            if(isclose||rooms[i][0]==1){
                isclose=true;
                dp[i][0]=0;
            }
            else{
                dp[i][0]=1;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(rooms[i][j]==1){
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
        int rooms[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                rooms[i][j]=sc.nextInt();
            }
        }
        System.out.print(no_of_paths(rooms,m,n));
    }
}
