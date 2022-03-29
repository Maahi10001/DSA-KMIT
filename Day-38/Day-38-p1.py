'''
Given a array of "array of words" and "characters", 
find the sum of length of all nice words using those characters.

nice word: a word is nice, if it can be formed by characters.

example: 

input =cat bt hat tree
atach
output=6

The words that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

input =apple orange bat tree
atbeppol
output =8

'''
#solution
def getthelength(arr,s):
    a=[]
    for i in arr:
        count=0
        for j in range(len(i)):
            if i[j] in s:
                count+=1
        if(count==len(i)):
            a.append(count)
    return sum(a)
if __name__=="__main__":
    arr=list(map(str,input().split()))
    s=input()
    print(getthelength(arr,s))
