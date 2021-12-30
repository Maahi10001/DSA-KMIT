'''
Shyam is given a sentence and asked him to check if it is the same reading from both sides or not. If it is same print true else print false


Note - Assume the input line here is not case sensitive
ignore the special symbols,spaces and compare only the characters and print true or false


input =a man a plan a canal panama
output = 1

in the above  example first character is 'a' last character is 'a'
second character is 'm' last second character is 'm' and comparing so on all characters should be equal


input =do nine men interpret nine men i nod
output = true

input =Red rum, sir, is murder
output = true 

input = Was it a cat I saw?
output = true

input =Eva,   can I s e e b^% e e s i n a ca;;;ve?
output = true 

input =No lemon, no melon
output = true 


'''
#solution
import re
a=input()
a=a.lower()
a=re.sub('[^A-Za-z]+', '', a)
b=a[::-1]
#print(a,b)
if b==a:
 print("true")
else:
 print("false")
'''
#java solution
import java.util.*;
class sol
{   public static void fun(String s)
    {  
        s=s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z]",""); 
        
        int l=s.length();
        //System.out.print(s);
        StringBuilder sb= new StringBuilder(s);
         StringBuilder sb2=new StringBuilder(sb.reverse());
        //System.out.print(sb2);
        String z=sb2.toString();
        if(z.equals(s))
        System.out.print("True");
        else
        System.out.print("False");
        
        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        fun(s);
    }
}
'''

