/*create two threads , where the first thread reads the 
employee records(5) from the user .

Second thread will print the sum of all salaries of employees

input =
101 abc 5000
102 xyz 2000
103 ram 3000
104 shyam 1000
105 hari 2500
output = 13500



*/
//soution
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String arr[][]=new String[5][3];
		Scanner sc=new Scanner(System.in);
		Thread t1=new Thread(new Runnable(){
		     public synchronized void run(){
		 try{
		  for(int i=0;i<5;i++)
            for(int j=0;j<3;j++)
                arr[i][j]=sc.next();
                
                Thread.sleep(400);
		    }
		    catch(Exception e){
		        System.out.print(e);
		    }
		     
		    }
		
		    
		  });
		
		Thread t2=new Thread(new Runnable(){
		    int count=0;
		   public synchronized void run(){
		   try{
		       for(int i=0;i<5;i++)
                count=count+Integer.parseInt(arr[i][2]);
         
            System.out.println(count);
		    
		    Thread.sleep(200);
		   }
		   catch(Exception e){
		      System.out.print(e);
		   }
		   }
		   
		    });
	     
		try{t1.start(); 
		    t1.join();
		    
		   t2.start();
		   t2.join();
		}
		catch(Exception e){
		    System.out.println(e);
		}
	}
}

