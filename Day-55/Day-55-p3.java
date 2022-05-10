'''
kapoor's have brought a tiny kitten in their house. Everybody is excited to give her a name.
but Mr.kapoor has a condition for the name ie there should be no duplicate adjacent character in the name.
but relatives were not aware of this condition and they have already sent some names.

Now your task is to minimize the given name according to the condition so that it can be accepted by mr.kapoor.

example: 
input =cherreis
output =chis

in cherreis first rr is removed, now the string is cheeis again 2 duplicate e's are coming, so after removing it output is chis, which can't be minimized further.

if final output is empty return -1.


'''
def helper(s):
    stack=[]
    for i in range(len(s)):
        if stack==[] or s[i]!=stack[-1]:
            stack.append(s[i])
        elif s[i]==stack[-1]:
            stack.pop()
    return "".join(stack)
if __name__=="__main__":
    s=input()
    res=helper(s)
    if(len(res)!=0):
        print(res)
    else:
        print(-1)
    
