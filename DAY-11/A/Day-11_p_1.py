'''
Tubby a Third Class Student has given a Assignment on Time Chapter by his class teacher.
Tubby is supposed to change the time given in AM/PM Format to 24 Hours Format. 
Help Tubby Solve the Problem 

The Maths teacher gave him the time in the following Format - HH:MM:SS:AM/PM

Assume all HH,MM,SS are in the valid range only 
 
Note: Midnight is 12:00:00AM on a 12-hour clock,  and 00:00:00 on a 24-hour clock. 
Noon is 12:00:00PM on a 12-hour clock,  and 12:00:00 on a 24-hour clock. 
     
Assume all input times are valid

Back end test cases

input = 06:10:20PM
output = 18:10:20

input = 01:45:50PM
output = 13:45:50

input = 10:05:30AM
output = 10:05:30

input = 02:13:19AM
output = 02:13:19
    
'''
#solution
l=input()
if "AM" in l:
    if "12" in l[:2]:
        s="00"+l[2:]
        print(s[:-2])
    else:
        print(l[:-2])
elif "PM" in l:
    if(l[:2]=="12"):
        print(l[:-2])
    else:
        s=12+int(l[:2])
        s=str(s)
        s=s+l[2:]
        print(s[:-2])
'''
#java solution
import java.util.*;
class sol
{
    public static void main (String[] args)
   {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    fun(s);
   }
    public static void fun(String str)
    {   int l=str.length();
        if(str.contains("AM"))
        {
            char[] ch = str.toCharArray();
            int a = ch[0] - '0';
            int b = ch[1] - '0';
            b=a*10+b;
            if(b==12)
            {
                ch[0]='0';
                ch[1]='0';
            }
            
            for(int i=0;i<l;i++)
            {  if(ch[i]=='A')
               break;
               else
                System.out.print(ch[i]);
            }
        }
        else
        {   char[] ch = str.toCharArray();
            int a = ch[0] - '0';
            int b = ch[1] - '0';
            b=a*10+b+12;
            System.out.print(b);
            for(int i=2;i<l;i++)
            {
                if(ch[i]=='P')
                break;
                else
                System.out.print(ch[i]);
            }
        }
    }
}

'''  