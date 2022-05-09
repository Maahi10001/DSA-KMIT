'''
A string is considered attractive if it satisfies the following conditions:

Each of the 5 English vowels ('a', 'e', 'i', 'o', 'u') must appear at least once in it. The letters must be sorted in alphabetical order (i.e. all 'a's before 'e's, all 'e's before 'i's, etc.).

For example, strings "aeiou" and "aaaaaaeiiiioou" are considered attractive, but "uaeio", "aeoiu", and "aaaeeeooo" are not attractive.

Given a string word consisting of English vowels, return the length of the longest attractive substring of word. If no such substring exists, return 0.

A substring is a contiguous sequence of characters in a string.

 
input =aeiaaioaaaaeiiiiouuuooaauuaeiu
output =13
Explanation: The longest attractive substring in word is "aaaaeiiiiouuu" of length 13.


input =aeeeiiiioooauuuaeiou
output =5

Explanation: The longest attractive substring in word is "aeiou" of length 5.

input =a
output =0
Explanation: There is no attractive substring, so return 0.

'''

def attractivestring(s):
    vowels=['a','e','i','o','u']
    i,j,maxvow_len=0,0,0
    while(j<len(s)):
        if(s[j] in vowels and (s[j-1]<=s[j] or j==0)):
            j+=1
        else:
            if(len(set(s[i:j]))==5):
                maxvow_len=max(maxvow_len,j-i)
            i=j
            j+=1
    if(len(set(s[i:j]))==5):
        maxvow_len=max(maxvow_len,j-i)
    return maxvow_len
if __name__=="__main__":
    s=input()
    print(attractivestring(s))

