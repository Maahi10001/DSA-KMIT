import java.util.*;
 class Test
 {
     public static boolean isSpecials(String s)
     {
         HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		  System.out.println(s);
         for(int i=0;i<s.length();i++)
         {
             char a=s.charAt(i);
             if(hm.containsKey(a))
             {
                 hm.replace(a,hm.get(a)+1);
             }
             else
             {
                 hm.put(a,1);
             }
         }
         int count=0;
         for(Map.Entry<Character,Integer> m : hm.entrySet())
         {
             if(m.getValue()%2!=0)
             {
                 count++;
                 if(count==2)
                 {
                     return false;
                 }
             }
         }
         return true;
     }
     
     public static int specialStrings(String s)
     {
         int count=0;
         for(int i=0;i<s.length();i++)
         {
             for(int j=i+1;j<=s.length();j++)
             {
                 if(isSpecials(s.substring(i,j)))
                 {
                     count+=1;
                 }
             }
         }
         return count;
     }
     
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         String str= sc.next();
         int ans=specialStrings(str);
         System.out.println(ans);
     }
 }