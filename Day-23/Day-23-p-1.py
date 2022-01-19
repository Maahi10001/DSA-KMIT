'''

Gopal is given a string s, Now he has to remove duplicate letters so that every letter appears once and only once.

He must make sure that the result produces should occur in the order given in string 

Example 1:

Input = bcabc
Output = bca
'''
#solution-basic
def func(s):
    p=""
    for i in s:
        if i not in p:
            p+=i
    return p
if __name__=="__main__":
    s=input()
    print(func(s))