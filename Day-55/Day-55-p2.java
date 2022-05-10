'''
Given a list of strings words and a string pattern, return a list of words[i] that match pattern. 
You may return the answer in any order.

A word matches the pattern if there exists a permutation of letters p so that after replacing 
every letter x in the pattern with p(x), we get the desired word.

Recall that a permutation of letters is a bijection from letters to letters: every letter maps
to another letter, and 
no two letters map to the same letter.

Note: print output in ascending order of words

input =abc deq mee aqq dkd ccc
abb
ouput =aqq mee

words= abc deq mee aqq dkd ccc
pattern =abb
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
             "aqq" matches the pattern because there is a permutation {a -> a, b-> q}
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, 
since a and b map to the same letter.



Example 2:
input =a b c
a
ouput =a b c




'''
def patternmatch(pattern,s):
    dic={}
    st=set()
    if len(s)!=len(pattern):
        return False
    for i in range(len(pattern)):
        if(pattern[i] in dic and dic[pattern[i]] !=s[i]) or (pattern[i] not in dic and s[i] in st):
            return False
        dic[pattern[i]]=s[i]
        st.add(s[i])
    return True
if __name__=="__main__":
    pattern=list(map(str,input().split()))
    s=input()
    res=[]
    for i in pattern:
        if(patternmatch(i,s)):
            res.append(i)
    res.sort()
    print(res)
        
