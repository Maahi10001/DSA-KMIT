/*
1) Given single linked list of digits, and given k value.

add k value to linked list 

note: 0<k<9 (k value is single digit number only)

ex:
input =1 2 3
1
output =1 2 4

input =1 0 0
5
output =1 0 5

input = 9 9 9 9 
1
output =1 0 0 0 0

input =1 2 9 9
1
output =1 3 0 0



*/
//solution
import java.util.*;

class Node
{
    int val;
    Node next;
    Node(int x){
         val=x;
         next=null;
    }
}


class Insert
{
    Node Head=null,Tail=null;
    Stack<Integer> stack=new Stack<Integer>();
    
       void ins(int x){
            
            Node ptr=new Node(x);
            
            if(Head==null){
                Head=ptr;
                Tail=ptr;
            }else{
                ptr.next=Head;
                Head=ptr;
            }
           
       }
    
      void insertele(int[] nums)
      {
        for(int x:nums){
              stack.push(x);
        }
      }
      
      
      void add(int k)
      {
          int remi=k;
          while(!stack.isEmpty())
          {
               int ele=stack.peek()+remi;
               ins(ele%10);
               //System.out.println(ele%10);
               if(ele>9){
                    remi=1;
               }else{
                   remi=0;
               }
               stack.pop();
          }
          if(remi!=0){
              ins(remi);
          }
      }


      void display(){
          Node tp=Head;
          while(tp!=null){
              System.out.print(tp.val+" ");
              tp=tp.next;
          }
          
      }
}


public class program
{
    static Scanner sc=new Scanner(System.in);
         static int[] str_to_arr(int n){
           int num[]=new int[n];
           for(int i=0;i<n;i++){
                   num[i]=sc.nextInt();
           }
                return num;      
        }
    public static void main(String args[])
    {
       
        int n=sc.nextInt();
        int num[]=str_to_arr(n);
        Insert obj=new Insert();
        obj.insertele(num);
        int k=sc.nextInt();
        obj.add(k);
        obj.display();
    }
}