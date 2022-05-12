/*
The season of the vivas are ON!! There are a number of student in a class.Each class of the
students has to give viva, but there is one rule teacher have decided to choose the student 
whose turn it will to give viva, The teacher is picking certain rollnumbers form the list of the 
students. 

On each day, studnet with high rollnumbers than his left student's rollnumer will be picked to 
give viva on that day. 

Determine the number of days after which no studnet from the initial picking is remaining to give
viva, i.e the time after which there is no student with higher roll number on his left.

input =
4
3 6 7 5

rollnumber of student randomly picked initially amongst all students

Use a 1-indexed array for result.

On day 1, rollnumber 6 and 7 will be picked to give viva 
remianing rollnumbers=[3,5].
On day 2, rollnumber 5 will be picked for viva 
remianing rollnumbers=[3]. 

There is no student with a higher rollnumber than one to its left, so that batch will be over 
with the viva and will be ready to enjoy the vacations.


input =
7
6 5 8 4 7 10 9
output = 2

Explaination
rollnumbers={6,5,8,4,7,10,9}
on 1st day 8,7,10 will be picked and remaining students are 4 for viva
remining after 1st day rollnumber={6,5,4,9}
One the 2nd day 9 will be picked and remaining students are 3 for viva 
remaining after 2nd day rollnumber={6,5,4}

There is no student with a higher rollnumber than one to its left, so that batch will be over with the viva and will be ready to enjoy the vacations.



*/
import java.util.*;
class program
{
    public static int get_vacation(List<Integer> a){
        boolean b=true;int c=0;
        ArrayList<Integer>temp=new ArrayList<>();
        while(b==true && a.size()>1)
        {  if(a.size()>1)
          {
            for(int i=1;i<a.size();i++)
            {
                if(a.get(i-1)<a.get(i))
                {
                 temp.add(i);
                }
            }
          }
            if(temp.size()!=0)
            { c++;
                for(int i=0;i<temp.size();i++)
                { //System.out.println(temp.get(i));
                  int num=temp.get(i);
                   a.remove(num-i);
                }
                
                temp.clear();
            }
            else
            {
                b=false;
            }
            
        }
       return c;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.print(get_vacation(arr));
    }
    
}