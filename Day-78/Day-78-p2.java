
/*Somu a third class student is working on a Maths Assignment on Time, given by 
his teacher.

He will be given the Begin Time and End Time. 

He is supposed to find the Number of Quarter Times in the given time period.
A Quarter time is considered as below

HH:00 to HH:15
HH:15 to HH:30
HH:30 to HH:45
HH:45 to HH:00

where HH represents an integer number from 00 to 23.

calculate the number of Quarter Times during the given time session

A 24-hour clock is used, so the earliest time in the day is 00:00 and the latest is 23:59.

if the start time is 04:20 and end time is 04:48. 

It implies you only one quarter from 04:30 to 04:45. 
You did not have the full quarter from 04:15 to 04:30 because you started the Second Quarter 
at 4:20 and you did not count the next quarter 04:45 to 05:00 because your end time is 04:48.  

If finishTime is earlier than startTime, then you have to calculate 
from startTime to the midnight and from midnight to finishTime.




input = 12:01
12:44
output=1

Explanation: 
------------
You have only quarter from 12:15 to 12:30


input = 20:00 
06:00

output = 40

Explanation:
------------
You have 16 quarters from 20:00 to 00:00 and 24 quarters from 00:00 to 06:00.*/

import java.util.*;

class program1 {
    
    public static int getCountOfQuarters(String s,String e) {
        int starthour=Integer.parseInt(s.substring(0,2));
        int startmin=Integer.parseInt(s.substring(3));
        int endhour=Integer.parseInt(e.substring(0,2));
        int endmin=Integer.parseInt(e.substring(3));
        int smin=starthour*60+startmin;
        int emin=endhour*60+endmin;
        if(smin>emin)
            emin+=24*60;
        return (int)(Math.floor(emin/15f)-Math.ceil(smin/15f));
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String start=sc.next();
        String end=sc.next();
        System.out.println(getCountOfQuarters(start,end));
    }
}
