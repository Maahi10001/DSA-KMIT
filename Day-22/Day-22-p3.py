'''

Shanmukha creating a special strings.
A string is said to be a special string, if all the letters appeared 
even number of times, or only one letter appeared odd number of times.

For example: "adda" and "iaaff" are special strings.
but "iaf" is not a special string.

You are given a word W, where W conatins the letters from a to j.
Our task is to findout, the number of non-empty special strings, 
which are substrings of word W can be formed.
if a substring appeared more than once, count each appearance separately.

NOTE: subsequences are not allowed.

Input Format:
-------------
A String W, the word.

Output Format:
--------------
Print an integer, number of special strings.


Sample Input-1:
---------------
egg

Sample Output-1:
----------------
5

Explanation:
------------
The special strings formed from the word "egg" are:
'e'gg, e'g'g, eg'g', e'gg', 'egg'.


Sample Input-2:
---------------
'baja'j

Sample Output-2:
----------------
9

Explanation:
------------
The special strings formed from the word "bajaj" are:
'b'ajaj, b'a'jaj, baj'a'j, ba'j'aj, baja'j', b'aja'j, ba'jaj', b'ajaj', 'bajaj'.

'''
#solution
def func(s):
    dp=[0]*1024 # a-j 10 characters so 2^10 =1024---#representing even bit as 0 and odd as 1
    temp=0 #(0-->10times)
    dp[0]=1 
    c=0 #count
    for i in s:
        temp=temp ^ (1<<(ord(i)-ord('a'))) # 1<<i will set ith bit to 1 else to 0   #xor will toggle the bit
        c=c+dp[temp]
        
        for i in range(10):
            c=c+dp[temp ^ (1<<i)]
        dp[temp]=dp[temp]+1
    return c
if __name__=="__main__":
    s=input()
    print(func(s))