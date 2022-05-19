'''Mr Febin is working with numbers.
He wants to find all the AD Numbers,
An AD Number is defined as follows:
	- All the adjacent digits in the given number N 
	should have an absolute difference of 1 only. 

You will be given two integers, start and end,
Your task is to find all the AD Numbers in ascending order
in the range of [start, end], where both are inclusive.

Constarint:
----------
0 <= start < end <2*10^9.

Input Format:
-------------
Two space separated intergers,  start and end.

Output Format:
--------------
Print a list of integers.


Sample Input-1:
---------------
0 15

Sample Output-1:
----------------
0 1 2 3 4 5 6 7 8 9 10 12


Sample Input-2:
---------------
25 65

Sample Output-2:
----------------
32 34 43 45 54 56 65

'''

def get_AD(x,y):
    res=[]
    for i in range(x,y+1):
        if(is_AD(i)):
            res.append(i)
    return res
def is_AD(num):
    prev=-1
    while(num>0):
        n=int(num%10)
        #print(n)
        if(prev!=-1):
            if(abs(prev-n)!=1):
                return False
        num=int(num/10)
        prev=n
    return True
        
if __name__=="__main__":
    x,y=map(int,input().split())
    print(get_AD(x,y))