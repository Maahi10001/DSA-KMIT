
'''Three Friends are given three rows of the keyboard, The first row is given to Shyam,second row is given to gopal, third row is given to ramu. 

Teacher has given them few lines of words and asked each individual if they can print the words that can be printed using the letters of the rows given to them 

Shyam has given the row -   QWERTYUIOP/qwertyuiop
Gopal has given the row -    ASDFGHIJKL/asdfghjkl
Ramu has given the row -   ZXCVBNM/zxcvbnm

Teacher also gave the following rules in addition ;
    You may use one character in the row more than once.
    You may assume the input string will only contain letters of alphabet(A-Z/a-z).
    Assume the alphabets are case sensitive 

    Print -1 for all Boundary Conditions 

Example:

input =hello Alaska Dad Peace
output = 
Alaska 
Dad


Here the words Alaska and Dad are the characters of second student gopal only 


input =asdf qwer zxcv
output =
asdf
qwer
zxcv

input =Dad hAS the Key
output = Dad
hAS

input =to be or not TO be 
output = to
or
TO

'''
#solution
def check(s1,s2,s3,s):
    res=[]
    for i in s:
        s_set=set(i.lower())
        if(s_set&s1 ==s_set) or (s_set&s2==s_set) or (s_set&s3==s_set):
            res.append(i)
    return res
if __name__=="__main__":
    s1 = {'q','w','e','r','t','y','u','i','o','p'}
    s2 = {'a','s','d','f','g','h','j','k','l'}
    s3 = {'z','x','c','v','b','n','m'}
    s = list(map(str,input().split()))
    res=check(s1,s2,s3,s)
    if(len(res)==0):
        print(-1)
    else:
        print(*res,sep="\n")