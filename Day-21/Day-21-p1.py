'''

Ramu is given a pair of words, Now his teacher has given him a task. 
His task is to see if the individual alphabets of the words are mapped properly or not 

If they do so print true else print false

Two strings are mapped properly  if the characters in 's' can be replaced to get 't'.
All occurrences of a alphabet must be replaced with another alphabet while preserving the order of alphabets
No two alphabets may map to the same alphabet but a alphabet may map to itself.


Note:
You may assume both s and t have the same length and all inputs contains('a-z')

input = 
egg
app
output = true

input = 
foo
bar
output = false

input = 
papel
title
output = true


'''

#isomorphic strings
#solution
def func(s1,s2):
    d1, d2, i = {}, {}, 0
    while i < len(s1):
        if s1[i] not in d1:
            if s2[i] in d2:
                if s1[i] != d2[s2[i]]:
                    return False
            d1[s1[i]], d2[s2[i]] = s2[i], s1[i]
        else:
            if s2[i] != d1[s1[i]]:
                return False
        i += 1
    return True
    
    
if __name__=="__main__":
    s1=input()
    s2=input()
    if(func(s1,s2)):
        print("true")
    else:
        print("false")