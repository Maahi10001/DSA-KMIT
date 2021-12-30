Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore
 
@Maahi10001 
sharuk2k3
/
FS-Elite-2021
Public
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
FS-Elite-2021/Day-11/Day_11_P_2.py /
@sharuk2k3
sharuk2k3 Day 11
Latest commit 4c628f1 2 days ago
 History
 1 contributor
61 lines (47 sloc)  1.12 KB
   
'''
Given a string S in encoded form, and  an integer array indices[] of string length.
You need to find the decoded form of String S, 
by moving each character at ith position in S, to indices[i] position in decoded string.
and then print the decoded string.
Input Format:
-------------
Line-1 -> A String S, enocded string of length L, 
          S conatins only lowercase alphabets [a-z]
Line-2 -> L space separated integers indices[], where 0 <=indices[i] < L 
Output Format:
--------------
Print a String, decoded string.
Sample Input-1:
---------------
aeilmmor
6 1 5 7 2 0 3 4
Sample Output-1:
----------------
memorial
Explanation:
---------------
Given String, a e i l m m o r
			  6 1 5 7 2 0 3 4
after shifting,	memorial
Sample Input-2:
---------------
aidin
4 3 2 0 1
Sample Output-2:
----------------
india
Explanation-2:
---------------
Given String, a i d i n
			  4 3 2 0 1
after shifting,	india
'''

def StringShuffle(s,l):
    ans = [i for i in s]
    for i,j in zip(s, l):
        ans[j] = i
    return "".join(ans)
s=input()
l=list(map(int,input().split()))
if __name__=="__main__":
    print(StringShuffle(s,l))
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
Loading complete