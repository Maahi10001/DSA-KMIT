/*
Given a number print the number of ways to represent the in string format.
given number is between 1 and 26 and these numbers represented as A to Z

example:
input =1176
output =3
1176  can be split three ways 1 1 7 6 or 11 7 6 or 1 17 6 or 1 1 76

AAGF(1 1 7 6), KGF(11 7 6), (AQF)1 17 6 , 1 1 76 is invalid


input=326
output =2 
326 can be split into two ways 3 2 6  or 3 26 or 32 6
CBF(3 2 6) CZ(3 26) only two ways (32 6) not valid split.

a
*/
import java.util.*;
class Test{
     public static int num_of_ways(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
               dp[i] += dp[i-1];  
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        System.out.print(num_of_ways(n));
    }
}