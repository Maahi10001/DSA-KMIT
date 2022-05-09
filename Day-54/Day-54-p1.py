'''
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

input =abc
pqr
output =apbqcr

Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

input =ab
pqrs
output =apbqrs
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s

input =abcd
pq
output =apbqcd
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c  d
word2:    p   q 
merged: a p b q c  d



'''


def mergedstrings(w1,w2):
    res=""
    i=0
    while(i<len(w1) or i<len(w2)):
        if(i<len(w1)):
            res+=w1[i]
        if(i<len(w2)):
            res+=w2[i]
        i+=1
    return res
if __name__=="__main__":
    w1=input()
    w2=input()
    print(mergedstrings(w1,w2))

