
'''
Shyam a clever boy, is good in analyzing the words given to him. 
He figures out the speciality of the word in any way. 
Given a word to Shyam, he determines few characters(consecutive) or whole word to be same from left to right and from right to left. 
Print the word which match the above pattern which has the maximum characters in it.
He considers the words which matches the above pattern, has a minimum length of 2. 

If no such word exists print -1

Now Check Shyam is correct or not by writing a code for him. 


for example:
input =abbbabbcbbacdb
output =abbcbba

input=hello
output=ll

input = abcd
output=-1
'''

#solution
def longestPalindrome(s):
        longest_palindrom = ''
        dp = [[0]*len(s) for _ in range(len(s))]
        for i in range(len(s)):
            dp[i][i] = True
            longest_palindrom = s[i]
        for i in range(len(s)-1,-1,-1):
            for j in range(i+1,len(s)):  
                if s[i] == s[j]:  #if the chars mathces
                    if j-i ==1 or dp[i+1][j-1] is True:
                        dp[i][j] = True
                         
                        if len(longest_palindrom) < len(s[i:j+1]):
                            longest_palindrom = s[i:j+1]
                
        return longest_palindrom                
    #return palindrom
s=input()
st=longestPalindrome(s)
if(len(st)<2):
    print(-1)
else:
    print(st)


        