'''
Given two strings a and b, return the minimum number of times you should repeat string a so that 
string b is a substring of it. If it is impossible for b to be a substring of a after repeating it,
return -1.

Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is 
"abcabc".

 

Example 1:
input =abcd
cdabcdab
output =3

Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times of a ie abcd is "abcdabcdabcd", b ie cdabcdab is a 
substring of it.



Example 2:
input =a
aa
output =2


'''
#from collections import Counter
def substring_rep(s,p):
    for i in set(p):
        if i not in s:
           return -1 
    if len(p)<len(s):
        return -1
    temp,i=s,1
    while(i>=1):
        if p in temp:
            return i
        else:
            temp+=s
            i+=1
            
if __name__=="__main__":
    string=input()
    pattern=input()
    print(substring_rep(string,pattern))