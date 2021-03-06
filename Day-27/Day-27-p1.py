'''
Ramu is a milk supplier. He has only two aluminium cups of capacity m and n litres. 
Using these two cups only, he can measure the milk. 
He has to supply exactly P litres of milk

To measure the milk, the operations allowed are:
	- Fill one of the cups completely with milk.
	- Empty the other cup.
	- Pour milk from one cup into another cup till it fills completely,
	 or the first cup itself is empty.
	 
Such that, at the end one or both cups contains P litres of the milk.
	
Please help Ramu, to check whether P litres of milk can be measured
using the two cups or not.

Input Format:
-------------
3 space separated integers, m, n and P.

Output Format:
--------------
Print a boolean value.


input=3 5 4
output=true


input=2 4 5
output=false

'''
#solution
def find(m,n) :
        while True:
            if m % n == 0:
                return n
            else:
                m, n = n, m % n
def func(m,n,p) :
     return (m+n) >= p and not (p % find(m,n))
if __name__=="__main__":
    m,n,p=map(int,input().split())
    if(func(m,n,p)):
        print("true")
    else:
        print("false")