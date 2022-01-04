Program-1

Steve is Designing a New email system.Where he wants to eliminate the gamil of based on few conditions. 

Every valid email consists of a local name and a domain name, in between '@'; 
For example, in "alice@gmail.com" , "alice" is the local name, and "gmail.com" is the domain name.

Besides lowercase letters, the email may contain one or more '.' or '+' .

If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to
the same address without dots in the local name. 


For example, "alice.z@gmail.com" and "alicez@gmail.com" forward to the same email address.
If you add a plus '+' in the local name, everything after the first plus sign will be ignored. 
This allows certain emails to be eliminated.
This rule will not be applicable to  to domain names.


For example, "m.y+name@email.com" will be forwarded to "my@email.com" .
It is possible to use both of these rules at the same time.


Help Steve to solve the problem 
He will be given an group of email-ids where we send one email to each emails[i], return the number of different addresses that
actually receive mails.


Sample Test Case 
Input =test.email+alex@gmail.com  test.e.mail+bob.cathy@gmail.com  testemail+david@gm.ail.com
Output: 2

Explanation: "testemail@gmail.com" and "testemail@gm.ail.com" actually receive mails.


Example 2:
Input: emails = ["a@gmail.com","b@gmail.com","c@gmail.com"]
Output: 3

import java.util.*;

class UniqueEmails{
    public int numUniqueEmails(String[] emails) {
        Set<String> normalized = new HashSet<>(); // used to save simplified email address, cost O(n) sapce.
        for (String email : emails) {
            String[] parts = email.split("@");                  // split into local and domain parts.
		//	System.out.println(parts[0]+" "+parts[1]);
			System.out.println();
            String[] local = parts[0].split("\\+");             // split local by '+'.
            normalized.add(local[0].replace(".", "") + "@" + parts[1]); // remove all '.', and concatenate '@' and domain.        
        }
        return normalized.size();
    }
	
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		String arr[]=sc.nextLine().split(" ");
		System.out.println(new UniqueEmails().numUniqueEmails(arr));
	}	
}


back end test cases

case = 1
input=test.email+alex@gmail.com test.e.mail+bob.cathy@gmail.com testemail+david@gm.ail.com
output=2

case = 2
input=x@gmail.com y@gma.il.com z@gmail.com
output=3

case = 3
input=abc@gmail.com
output=1

case = 4
input=abc@gmail.com ab.c@gmail.com a.b.c@gmail.com
output=1




Program-2

A Gold  merchant, announced an offer that they will charge the minimum price to make all the 
gold coins into one.

Customers who has different weights of gold coins wants to utilize the offer.

The processing charge to make two coins into one is calculated as follows:
	- To make two coins of weights A and B into one coin, 
	  you have to pay the amount 'A + B'. 

Your task is to help Gold Merchant to keep his promise and 
to charge the minimum amount to  gold coins
into one gold coin

Input Format:
-------------
Single line of space separated integers, number on the boxes.

Output Format:
--------------
Print an integer, minimum amount to be paid by Customer


Sample Input-1:
---------------
4 3 6

Sample Output-1:
----------------
20


Sample Input-2:
---------------
5 2 4 3 6

Sample Output-2:
----------------
45

back end test cases
case =1
input =1 8 3 5
output =30

case =2
input =5 2 4 3 6
output =45

case =3
input =3 8 5
output =24

case =4
input =2 5 7 3 8 9 4 6 11
output =168

case =5
input =3 12 8 11 4 14 9 8 12 11 7 1 15 2 1
output =432


import java.util.*;

class MinimumCost {
    int left = 0, right = 0, numSticks, numResults = 0, num;
    // Gets the minimum from InputSet and ResultSet
    private boolean getMin(int[] sticks) {
        // check if there are numbers available from InputSet and ResultSet
        boolean f = right < numSticks, s = left < numResults;
        // If number is available from both sets, choose the smallest
        if (f && s) num = (sticks[left] <= sticks[right]) ? sticks[left++] : sticks[right++];
        // If number is available from InputSet only
        else if (f) num = sticks[right++];
        // If number is available from ResultSet only
        else if (s) num = sticks[left++];
        return f || s; // Returns result saying if we could find a number from any one of the Sets.
    }
    
    public int connectSticks(int[] sticks) {
        numSticks = sticks.length;
        Arrays.sort(sticks); // Initial sort
        int result = 0, first, second; // Result and place holders to get the smallest two numbers.
        // Continue till you can get two numbers every time from the Sets.
        while (true) {
            if (!getMin(sticks)) break;
            first = num;
            if (!getMin(sticks)) break;
            second = num;
            result += sticks[numResults++] = first + second; // Store the sum back in the ResultSet
        }
        return result;
    }
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int[] sticks = Arrays.asList(str).stream().mapToInt(Integer::parseInt).toArray();
		System.out.println(new MinimumCost().connectSticks(sticks));
	}
}



Program-3


You are given a sequence A of N integers: A1,A2,A3... AN.

You would like to make all elements in A different. To do so, you may perform operations 
of two types:

Remove an element. The cost of this operation is X coins.
Decrease the value of an element by one. The cost is Y coins.
You may perform as many operations as you wish.
It is possible and allowed that some elements will become negative
(after you decrease an element multiple times).

Your task is to find the minimum number of coins you would need in order to 
make A pairwise distinct.

Input Format
------------
The first line contains three space-separated integers N, X, and Y 
		— the size of the sequence and costs of operations.
The second line contains N space-separated integers A1,A2,A3...AN
		— the initial sequence.

Output Format
-------------
Print one integer — the minimum number of coins needed to make A pairwise distinct.



Sample Input :
6 10 3
5 2 5 3 5 2

Sample Output :
16

Explanation :
we are given a sequence of size n=6.
The cost of removing and decreasing by one are 10 and 3 respectively.

The initial sequence is (5 2 5 3 5 2).
One optimal strategy is:

Remove one of three fives, e.g. the middle one. The remaining sequence is (5 2 3 5 2).
Decrease the second element by one, to get (5 1 3 5 2).
Decrease the first element by one, to get (4 1 3 5 2).
This way, you need to spend 10+3+3 =16 coins. 
The resulting sequence(4 1 3 5 2) is indeed pairwise distinct.


import java.util.*;

public class MakeThemDiff {
    public static void main(String args[] ) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        long cost = 0;
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        HashMap<Integer,Integer> distinctNumbers = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            int h = a[i];
            if(distinctNumbers.containsKey(h))
            {
                int cnt = 0;
                //repeat until number not found, decrement it ,increase the count 
                //and check for decremented value 
                while(distinctNumbers.containsKey(h))
                {
                    h--;
                    cnt+=1;
                }
                //check whether removal costs more or decrement costs more
                if(cnt*y>x)
                {
                    cost+=x;
                }
                else
                {
                    cost+=cnt*y;
                    distinctNumbers.put(h,1);//add decremented number to list
                }
            }
            else
            {
            	distinctNumbers.put(h,1);
            }
        }
        System.out.println(cost);
    }
}


back end test cases

case = 1
input =6 10 3
5 2 5 3 5 2
output =16

case = 2
input =15 3 2
10 10 10 10 10 7 7 7 7 7 8 8 8 8 8
output =34

case = 3
input =25 7 5
78 65 45 34 87 78 65 45 45 34 54 34 23 32 23 23 34 52 67 45 78 79 65 65 66 
output =81

case = 4
input =31 10 8
78 65 45 34 87 78 65 45 45 34 54 34 23 32 23 23 34 52 67 45 78 79 65 65 66 5 2 5 3 5 2
output =146
