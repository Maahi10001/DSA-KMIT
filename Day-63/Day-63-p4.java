/*
In special MATHS where there is no rule of operator precedence. 
All operators have equal precedence. 

If + comes before * then + should perform before *.

for given input 1-2*3 

in general maths gives -5 as answer , but in special MATHS it is -3
Evaluate the given string 

string has only numbers (1 to 9) , operators(+,-,*,/)
Between every number there will be a operator

input =1-2*3
output =-3

input =
1+2-3*4
output =0
*/
import java.util.*;
class program {
    public static int evaluate(String str) {
        String [] arr=str.split("[-+*/]");
        int ans=Integer.parseInt(arr[0]);
        int j=1;
        for(int i=1;i<str.length();i++){
            switch(str.charAt(i)){
                case '+':ans+=Integer.parseInt(arr[j]);
                         j++;
                         break;
                case '-':ans-=Integer.parseInt(arr[j]);
                         j++;
                         break;
                case '*':ans*=Integer.parseInt(arr[j]);
                         j++;
                         break;
                case '/':ans/=Integer.parseInt(arr[j]);
                         j++;
                         break;
           
            }
            // for(int i=0;i<arr.length;i++){
            //     System.out.println(arr[i]);
            // }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(evaluate(s));
    }
    
}