/*

amu is playing with two strings s1 and s2. he wants to construct the newString in the following way.

   -- if s1 is not empty append the first character in s1 to newString and delete it from s1.
     example: if s1=abc and newString=de, then after choosing this operation, s1=bc and newString =dea
   -- if s2 is not empty append the first character in s2 to newString and delete it from s2.
      example: if s2=abc and newString="" then after choosing this operation, 
      s2=bc and newString= a
  Note: return the lexicographically largest newString ramu need to construct

example 1:
intput =
cabaa
bcaaa
output =cbcabaaaaa
*/
//solution
public String formNewString(String s1, String s2) 
{
        if (s1.length() == 0  || s2.length() == 0)
            return s1 + s2;

        if (s1.compareTo(s2) > 0)
            return s1.charAt(0) + formNewString(s1.substring(1), s2);


        return s2.charAt(0) + formNewString(s1, s2.substring(1));
    }