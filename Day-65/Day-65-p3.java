/*

Rakesh is calculating maximum value of two words len(word[i]) * len(word[j])  where the words do not share common letters.

Note: if no such two words exist , return 0.

ex:
input =abcw baz foo bar xtfn abcdef
output =16
abcw and xtfn two words doesnot share common letters so output is 16

input =a ab abc d cd bcd abcd
output =4
ab cd two words doesnot share common

input =a aa aaa aaaa
output =0
no such pair of words
*/
import java.util.*;
/*
approach->bit masking
take each and evry word form the worda arrays and mapping the characteers of the worrds and storing it in a state array.
->iteraing the array and calculating using bit wise & and if characters between  any two words are same then & operation between there respective state values will give values other than 0 
->if any two words & will give 0 idiates all words are different so we calculate their product length and return the max product so far.
*/

class program{
    public static int getstatefromstring(String s){
            int state=0;
            for(char c:s.toCharArray()){
                int ind=c-'a';
                state |=1<<(ind);
            }
            return state;
        }
    public static int maxProduct(String[] words) {
        int len=words.length;
        int[] state=new int[len];
        for(int i=0;i<len;i++){
            state[i]=getstatefromstring(words[i]);
        }
        int max=0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if((state[i]&state[j])==0){
                    if(words[i].length()*words[j].length()>max){
                        max=words[i].length()*words[j].length();
                    }
                }
        }
    }
    return max;
  }
  public static void main(String [] args)
  {
      Scanner sc=new Scanner(System.in);
      String S=sc.nextLine();
      String []words=S.split(" ");
      System.out.print(maxProduct(words));
  }
}