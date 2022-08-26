/*Well formed groupings are as follows, (), [], {}, {()}, {[]()}, {[]}(), etc.

You will be given a string S, return true if the string S is a well formed 
grouping, otherwise false.

Note: S contains only characters ( ) [ ] { }

Input Format:
-------------
A string S, contains only characters (){}[]

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
{[([])[]]}

Sample Output-1:
----------------
true


Sample Input-2:
---------------
{[([])[]}]

Sample Output-2:
----------------
false
*/
import java.util.*;
class program{
    public static boolean match(String s){
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
         if(c=='(') st.push(')');
         else if(c=='{') st.push('}');
         else if(c=='[') st.push(']');
         else if(st.isEmpty() ||st.pop()!=c) return false;
        }
        return st.isEmpty();
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(match(s));
    }
}