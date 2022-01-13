'''
Shyam is given a group of numbers and a value(k),Now he wants to see if the group of numbers 
can be arranged into sets of k consecutive groups. 

if he can do print yes else print no 

The first line of input consists of the group of numbers followed by a value (k) 

input = 1,2,3,3,4,4,5,6
4
output = yes

Explanation: Group can be arranged into (1,2,3,4) and (3,4,5,6)


Input = 3 2 1 2 3 4 3 4 5 9 10 11
3
output = yes

Explanation: Group can be arranged into (1,2,3) , (2,3,4) , (3,4,5) and (9,10,11).

Input = 1 2 3 4 
3
output = no


Explanation: Each group should be arranged in sub-group of size 3.




'''


#solution
def check(l,n):
    if(len(set(l))%n==0):
        return "yes"
    else:
        return "no"
if __name__=="__main__":
    l=list(map(int,input().split()))
    n=int(input())
    print(check(l,n))