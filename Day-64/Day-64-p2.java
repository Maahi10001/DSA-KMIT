/*

You are given an encoded string s . To decode the string to a tape, the encoded string is read one character at
a time and the following steps are taken:
      If the character read is a letter, that letter is written onto the tape.
      If the character read is a digit d , the entire current tape is repeatedly written d - 1 more times in
total.

Given an integer k , return the k letter (1-indexed) in the decoded string.

Example 1:
Input: s = "ha22", k = 5
Output: "h"
Explanation: The decoded string is "hahahaha".
The 5 letter is "h".

input Input: s = "leet2code3", k = 10
Output: "o"
Explanation: The decoded string is "leetleetcodeleetleetcodeleetleetcode".
The 10 letter in the string is "o".


Input: s = "a2345678999999999999999", k = 1
Output: "a"
Explanation: The decoded string is "a" repeated 8301530446056247680 times.
The 1 letter is "a".
*/

import java.util.*;
class Main{
    public static char decoded_string(String str,int k){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
             //System.out.print(c);
             
            if(Character.isDigit(str.charAt(i))){
                int len=Character.getNumericValue(str.charAt(i));
                //System.out.print(len);
                String s=sb.toString();
                while(len-1>0){
                    sb.append(s);
                    len--;
                }
                if(i==k && !Character.isDigit(sb.charAt(k-1))){
                 return sb.charAt(k-1); 
                }
            }  
            else
                sb.append(str.charAt(i));
                
        }
        // System.out.println(sb);
    return sb.charAt(k-1);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int k=sc.nextInt();
        System.out.println(decoded_string(str,k));
    }
}
