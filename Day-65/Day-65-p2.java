/*
Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary representation of n. If there are no two adjacent 1's, return 0.

Two 1's are adjacent if there are only 0's separating them (possibly no 0's).
The distance between two 1's is the absolute difference between their bit positions.

For example, the two 1's in "1001" have a distance of 3.

 
input = 22
output = 2

Explanation: 22 in binary is "10110".
The first adjacent pair of 1's is "10110" with a distance of 2.
The second adjacent pair of 1's is "10110" with a distance of 1.
The answer is the largest of these two distances, which is 2.
Note that "10110" first 1 and third 1 is not a valid pair since there is a 1 separating the two 1's.


input == 8
output = 0
Explanation: 8 in binary is "1000".
There are not any adjacent pairs of 1's in the binary representation of 8, so we return 0.


Example 3:
input = 5
output = 2

Explanation: 5 in binary is "101".

*/
import java.util.*;

/*approach:-
iterating the string and when ever 1 occur in string storing that 
index in list and taking difference bwtween all indexes
and return the maximum distance
*/
class program{
  public static int distance(int num){
      String s=Integer.toBinaryString(num);
      List<Integer> arr=new ArrayList<Integer>();
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='1')
            arr.add(i);
      }
      //List<Integer> indexes=new ArrayList<Integer>();
      int max=0;
      for(int i=0;i<arr.size()-1;i++){
          max=Math.max(max,Math.abs(arr.get(i)-arr.get(i+1)));
      }
      
      /*for(int i=0;i<indexes.size();i++){
          if(max<indexes.get(i)){
              max=indexes.get(i);
          }
      }*/
      return max;
  }
  public static void main(String [] args)
  {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      //int binary=Integer.parseInt(s,2);
      System.out.print(distance(num));
  }
}