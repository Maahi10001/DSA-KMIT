/*Given two strings s1 and s2, return the lowest ASCII sum of deleted characters to make two strings equal.

input =sea
eat
--deleting s from sea adds the ASCII value of s(115) to the sum.
-- deleting t from eat adds 116 to sum
at the end, both strings are equal, and 115+116=231 is minimum sum possible to achieve this.

input =delete 
leet

deleting dee from delete to turn the string into let.
add 100(d)+101(e) to the sum
Deleting "e" from "leet" adds 101[e] to the sum.

At the end, both strings are equal to "let", and the answer is 100+101+101+101 = 403.
If instead we turned both strings into "lee" or "eet", we would get answers of 433 or 417, which are higher.

*/
import java.util.*;
class Test{
    public static int ASCII_sum(String s1,String s2){
        int n=s1.length(),m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<m+1;i++){
            dp[0][i]+=(dp[0][i-1]+(int)s2.charAt(i-1));
        }
        for(int i=1;i<n+1;i++){
            dp[i][0]+=(dp[i-1][0]+(int)s1.charAt(i-1));
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.min(dp[i][j-1]+(int)s2.charAt(j-1),dp[i-1][j]+(int)s1.charAt(i-1));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.print(ASCII_sum(s1,s2));
    }
}
