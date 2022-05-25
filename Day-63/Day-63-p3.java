/*
You are given  a single line of strings separated by space . 
You need to arrange them lexicographically. 
A lexicographical order is the dictionary order.


Input contains a single line of strings in a space separated manner.
String contains only uppercase English letters.
Output
Print the sorted array.


input =ASH AAB JKR FTE
output =AAB ASH FTE JKR

*/
import java.util.*;
class program
{
    public static void Sort(String[] str, int n)
    {
        for(int i = 0; i < n-1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {  
                if (str[i].compareTo(str[j]) > 0) 
                {  
                   String temp = str[i];  
                   str[i] = str[j];  
                   str[j] = temp;  
                }  
            }
        }
        for(int i = 0; i < n; i++) 
        {  
            System.out.print(str[i]+" ");  
        }  
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        Sort(str1, str1.length);
    }
}