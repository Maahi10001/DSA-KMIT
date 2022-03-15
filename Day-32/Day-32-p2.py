#solution
#from collections import queue
'''
Mike has a iPhone. His iPhone has a Number Lock of 4 digits. 
The keypad has been disabled and the numbers can scroll. 
Each Scroll consists of Numbers(0-9). 
It can be done from 0 to 9 or 9 to 0. 

The phone has some Dead Ends, if any one tries to open the lock and falls in the Dead End, 
the phone resets to the initial state and all information is lost. 

Initially, the number lock is set to 0000.
and you will be given the unlock key, your task to find and print
the minimum number of rotations required to unlock the phone,
If it is not possible to unlock  without reseting to the Initial State, print -1.

NOTE:
In one rotation you can choose any one wheel and 
rotate to its next or previous digit.

input=0302 0202 0203 2323 3003
0303 
output=8

Explanation:
------------
To unlock the valid possible rotations are as follows:
0000 > 1000 > 1100 > 1200 > 1201 > 1202 > 1302 > 1303 > 0303.




input=6656 6676 6766 6566 5666 7666 6665 6667
6666 
output=-1


Explanation:
------------
You can't unlock

'''
def getlock(d,s):
    ans = 0
    a = ["0000"]
    d = set(d)
    while a: 
        temp = []
        for n in a: 
            if n not in d: 
                d.add(n)
                if n == s: return ans 
                for i in range(4): 
                    for z in (-1, 1): 
                        nn = n[:i] + str((int(n[i]) + z) % 10) + n[i+1:]
                        temp.append(nn)
        a = temp
        ans += 1
    return -1 
if __name__=="__main__":
    d=list(map(str,input().split()))
    s=input()
    print(getlock(d,s))
    
    