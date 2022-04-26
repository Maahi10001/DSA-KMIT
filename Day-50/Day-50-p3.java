/*
Given a matrix of size R*C, print the matrix in the following given output.

input =
3 3
1 2 3
4 5 6
7 8 9
output =
1 2 3
6 9 8
7 4 5

input =3 4
1 2 3 4
5 6 7 8
9 10 11 12
output =
1  2  3  4
8 12 11 10
9  5  6  7


*/

//solution
import java.util.*;

public class Test 
{
    public static void Matrix(int[][] arr, int r, int c) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr.length == 0 || arr == null)
            System.out.println(result);
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        int elements = arr.length * arr[0].length;
        while (result.size() < elements) 
        {
            for (int i = left; i <= right && result.size() < elements; i++) 
            {
                result.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom && result.size() < elements; i++) 
            {
                result.add(arr[i][right]);
            }
            right--;
            for (int i = right; i >= left && result.size() < elements; i--) 
            {
                result.add(arr[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top && result.size() < elements; i--) 
            {
                result.add(arr[i][left]);
            }
            left++;
        }
        
        for (int i = 0; i < result.size(); i++) 
        {
            System.out.print(result.get(i) + " ");
            if (i % r == 0) 
            {
                System.out.println();
            }
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] mat = new int[r][c];
        
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                mat[i][j] = scanner.nextInt();
            }
        }
        
        Matrix(mat, r, c);
    }
}