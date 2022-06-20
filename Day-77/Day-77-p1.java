/*
Rakesh playing a puzzle with given word. word contains characters a to z small letters and '?' marks.
all the question marks in the given word can be replace with any character in a to z range.
help him to replace question marks with a-z range, after replacing returns the word if it is palidrome other wise print "NO".

input =?a?
output =aaa 
in this case many possible replacements, aaa,bab,cac,dad,eae .......zaz
we need to choose palindrome string which is lexicographically smallest ie aaa.


input =?ab??a
output =aabbaa

input =bab??a
output =NO

*/
import java.util.*;
class Test{
    public static boolean check(char[] s){
        int n=s.length;
        for(int i=0;i<n/2;i++){
            if(s[i]!='?'&&s[n-i-1]!='?'&&s[i]!=s[n-i-1]){
                return false;
            }
        }
        return true;
    }
    public static String is_palin(char[] s){
        if(!check(s)){
            return "NO";
        }
        int n=s.length;
        for(int i=0;i<n;i++){
            if(s[i]=='?'){
                if(s[n-i-1]!='?')
                    s[i]=s[n-i-1];
                else{
                   s[i]=s[n-i-1]='a';        
                }
            }
        }
        return new String(s);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(is_palin(s.toCharArray()));
    }
}
