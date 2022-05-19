/*There are M*N buckets of milk, all the buckets are equal in size (in ltrs).
The buckets are initially filled with different amounts of milk in liters.

You are given the amount of milk in the buckets as a grid of size M x N, 
buckets[][]. You need to make that all the buckets have same quantity of Milk.
You are allowed to perform one operation either adding M liters of Milk
or take away M liters of Milk from the bucket in one step.

Your task is to return the minimum number of steps required to make 
all the buckets in the bucket grid contains same amount of Milk. 
If it is not possible, return -1.

Input Format:
-----------------
Line-1: three space sepaarted integers, A, B and M.
Next A lines: B space sepaarted integers, amount of milk in liters.

Ourput Format:
-------------------
Print the integer result.


Sample Input-1:
-----------------
2 3 5
5 10 15
20 25 40

Sample Output-1:
-------------------
11

Explanation: 
------------
We can make every bucket has equal amount of Milk to 4liters by doing
the following: 
- Add 5ltrs milk to 5ltrs bucket 3 times.
- Add 5ltrs milk to 10ltrs bucket 2 times.
- Add 5ltrs milk to 15ltrs bucket 1 time.
- Takeaway 5ltrs milk from 25ltrs bucket 1 time.
- Takeaway 5ltrs milk from 40ltrs bucket 4 times.
A total of 11 operations required.


Sample Input-2:
-----------------
3 3 3
1 2 3 4
5 6 7 8
9 19 11 12

Sample Output-2:
-------------------
-1



*/
import java.util.*;
class program{
    public static int minimum_milk(int n,int m,int [][]matrix,int k){
        int [] arr = new int[n * m];
        int mod = matrix[0][0] % k;
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < m; ++j) 
            {
                arr[i * m + j] = matrix[i][j];
                if (matrix[i][j] % k != mod) 
                {
                    return -1;
                }
            }

        }
        Arrays.sort(arr);
        int median = arr[(n * m) / 2];
        int minOperations = 0;
        for (int i = 0; i < n * m; ++i) 
            minOperations += Math.abs(arr[i] - median) / k;
        if ((n * m) % 2 == 0)
        {
        int median2 = arr[( (n * m) / 2 ) - 1];
        int minOperations2 = 0;
        for (int i = 0; i < n * m; ++i) 
            minOperations2 += Math.abs(arr[i] - median2) / k;
        minOperations = Math.min(minOperations, minOperations2);

        }
        return minOperations;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int milk=sc.nextInt();
        int[][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(minimum_milk(n,m,arr,milk));
    }
}