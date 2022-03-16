'''
Wonderful String

You will be given a Wonderful String,print the numbers of '2' in the wonderful string. 

A wonderful string contains only two digits '1' and '2'.

The string has following rules
	- The first few digits are as follows: 
	    "1221121221221121122......"
	- The string is originally formed as follows:
		1 22 11 2 1 22 1 22 11 2 11 22 ......
	and the count of '1's or '2's in each consecutive groups are:
		1 2 2 1 1 2 1 2 2 1 2 2 ......
	the count sequence above is in the string S itself.



input=7
output=3

Explanation:
------------
The sustring of length 7 is "1221121".The count of 2's is 3.


input=12
output=7

Explanation:
------------
The sustring of length 12 is "122112122122".The count of 2's is 7.


'''
#solution

def getcount(s):
    return s.count('2')
if __name__=="__main__":
    n=int(input())
    st="1221121221221121122"
    s=st[0:n]
    s=list(s)
    print(getcount(s)_