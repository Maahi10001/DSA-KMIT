'''
Amazon Fire TV Stick Remote

Tinku a Small Kid is playing with the Amazon Fire TV Stick Remote
Tinku is not familar with the alphabets. 
He father gives him few alphabets and asks Tinku to type it. 
Tinku uses only one finger. 
At the Beginining, he will put his finger at the the 1st key, k[0];
To type the Next Alphabet he has to move his finger from that key(m) 
to that particular alphabet(n) he takes |m-n| seconds. 

Help Tinkus Father to see how much seconds does Tinku take to type the given alphabets.


input=poiuytrewqasdfghjklmnbvcxz
kmit
output=39


input=abcdefghijklmnopqrstuvwxyz
code
output=26
'''
#solution
def func(s,key):
    temp=0
    pos=0
    for i in key:
        x=s.find(i)
        t=abs(x-pos)
        pos=x
        temp += t
    return temp
if __name__=="__main__":
    s=input()
    key=input()
    print(func(s,key))