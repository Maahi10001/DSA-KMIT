'''
Ramesh has given a task to you on Strings.
You have given a string S ([a-z]), and an integer array Arr[]
Now your task is to modify 'S' in such way:
replace the 'i+1' characters in the string, with next i-th character in alphabetic order(cyclic).

For example, if S="art", Arr[]=[2,3,5] is 3, 
i=0, modify('a') = 'c' , S="crt".
i=1, modify('c') = 'f', modify('r') = 'u', S="fut".
i=2, modify('f') = 'k', modify('u') = 'z', modify('t') = 'y', S="kzy"
Finally modified string is kzy. 

Note: modify('z') ='a' when arr[i]=1

Return the final modified string after all such modifications to S are applied.

Input Format:
-------------
Line-1 -> A String S,  string length is L
Line-2 -> L space separated integers.

Output Format:
--------------
Print modifed String.


Sample Input-1:
-------------------
adbp
1 2 3 4

Sample Output-1:
--------------------
kmit


'''
#solution
def getword(s,l):
    res=list(l)
    for i in range(len(s)-2,-1,-1): # getting the prefix sum by traversing from last
        res[i]+=res[i+1]
    temp=[]
    for  i in range(len(s)):
        restr=(ord(s[i])-ord('a')+res[i]%26)%26  #%26 if the sum exceeds 26
        temp.append(chr(ord('a')+restr)) 
    return ''.join(temp)
        
if __name__=="__main__":
    s=input()
    l=list(map(int,input().split()))
    print(getword(s,l))