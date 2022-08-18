/*Mr. Dhanush has provided the string NUM, which solely contains digits.
He is looking for substrings that are numbers and have an equal number of 
distinct digits in each of them. It follows the rule if the number is 123123, 
but not if the number is 12312.

Your task is to assist Mr. Dhanush in determining the number of distinct 
substrings (numbers) of NUM that adhere to the mentioned rule.


Input Format:
-------------
A string NUM, consist of diits [0-9]

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
6767

Sample Output-1:
----------------
5

Explanation: 
------------
The list of words are: 6,7,67,76,6767


Sample Input-2:
---------------
2345432

Sample Output-2:
----------------
16

Explnation:
-----------
The list of words are: 2,3,4,5,23,34,45,54,43,32,234,345,543,432,2345,5432
*/


import java.util.*;
public class program  
{  public static int distinctSubstring(String str)
	{
		// Put all distinct substring in a HashSet
		Set<String> result = new HashSet<String>();
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
			   // System.out.println(">"+str.substring(i, j));
			    if(gg(str.substring(i, j)))
				    result.add(str.substring(i, j));
				    //System.out.println("->"+result);
			}
		}
		return result.size();
	}

	
     public static boolean gg(String s) 
     {  
 
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, new Integer(val + 1));
            }
            else {
               map.put(c, 1);
           }
        }
        Set<Integer> set = new HashSet<Integer>(map.values());
        return set.size()==1?true:false;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        String str =sc.next();//Integer.toString(n);
        System.out.println(distinctSubstring(str));
    }
}