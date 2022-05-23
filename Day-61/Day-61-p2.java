/*
Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

input =3 4
0 1 1 1
1 1 1 1
0 1 1 1
output =15

Explanation: 
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.


Example 2:
input =3 3
1 0 1
1 1 0
1 1 0
output =7

Explanation: 
There are 6 squares of side 1.  
There is 1 square of side 2. 
Total number of squares = 6 + 1 = 7.
 

*/
import java.util.*;
class program{
    public static int get_square_count(int m,int n,int [][]matrix){
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]>0&&i>0&&j>0){
                    matrix[i][j]=Math.min(matrix[i-1][j-1],Math.min(matrix[i-1][j],matrix[i][j-1]))+1;
                }
                count+=matrix[i][j];
            }
        }
        return count;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print(get_square_count(m,n,matrix));
        
        
    }
}