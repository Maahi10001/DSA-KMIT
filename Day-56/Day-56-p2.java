/*
Given a string expression of numbers and operators, return all possible results from computing all the different possible ways to group numbers and operators.
Note: assume operators will have only +,-,*
      All integer values must be in range between 0 to 99

Example 1:
input =2-1-1
output =0 2

expression = "2-1-1"
Output: [0,2]
Explanation:
((2-1)-1) = 0 
(2-(1-1)) = 2

Note : print the output in ascending order 

Example 2:
input =2*3-4*5
output =-34 -14 -10 -10 10

expression = "2*3-4*5"
Output: [-34,-14,-10,-10,10]

Explanation:
(2*(3-(4*5))) = -34 
((2*3)-(4*5)) = -14 
((2*(3-4))*5) = -10 
(2*((3-4)*5)) = -10 
(((2*3)-4)*5) = 10



*/
import java.util.*;
class program
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        List<Integer> al=getAllPossible(str);
        Collections.sort(al);
        System.out.println(al);
    }
    public static List<Integer> getAllPossible(String s)
    {
        if(s.length()<=2)
        {
            List<Integer> al=new ArrayList<>();
            al.add(Integer.parseInt(s));
            return al;
        }
        List<Integer> al=new ArrayList<>();
        int n=s.length();
        
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(!Character.isDigit(c))
            {
                String left=s.substring(0,i);
                String right=s.substring(i+1);
            List<Integer> a=getAllPossible(left);
            List<Integer> b=getAllPossible(right);
            
            for(int x:a)
            {
                for(int y:b)
                {
                    if(c=='+')
                    al.add(x+y);
                    else if(c=='-')
                    al.add(x-y);
                    else if(c=='*')
                    al.add(x*y);
                }
            }
                
            }
            
        }
        return al;
        
    }
}