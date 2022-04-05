'''
`Shyam is playing with group of characters, where the group of characters contain only A/B.

He has to return the count of non-empty substrings from this group which will have the same number of
A's and B's and all the A's and all the B's in these substrings are grouped consecutively

Substrings that occur multiple times are counted the number of times they occur.

 
Example 1:

Input = AABBAABB
Output = 6

Explanation: 
There are 6 substrings that have equal number of consecutive B's and A's: 
"AABB", "AB", "BBAA", "BA", "AABB", and "AB".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "AABBAABB" is not a valid substring because all the A's (and B's) are not grouped together.

Example 2:

Input = BABAB
Output = 4
Explanation: 
There are 4 substrings: "BA", "AB", "BA", "AB" that have equal number of consecutive B's and A's.

'''
#solutionn:-
def countsubstr(s):
    x,y,count=0,1,0
    for i in range(1,len(s)):
        if(s[i]==s[i-1]):
            y+=1
        else:
            x,y=y,1
        if(y<=x):
            count+=1
    return count
    
if __name__=="__main__":
    s=input()
    print(countsubstr(s))