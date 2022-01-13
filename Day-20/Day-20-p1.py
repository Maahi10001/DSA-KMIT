'''

Given two Integer ArrayList, add their elements to a new ArrayList by satisfying following conditions 

1. Addition should be done starting from 0th index of both ArrayList.
2. Split the sum if it is a not a single digit number and store the digits in adjacent locations
3. Output ArrayList should accommodate any remaining digits of larger input ArrayList.
4.Assume the input contains only positive numbers

Examples:
First line contains the size of first ArrayList followed by first ArrayList elements followed by second ArrayList size followed by 
second ArrayList elements 


input =
6
9 2 3 7 9 6
8
3 1 4 7 8 7 6 9
output =
1 2 3 7 1 4 1 7 1 3 6 9

input = 
6
9343 2 3 7 9 6
8
34 11 4 7 8 7 6 99
output =
9 3 7 7 1 3 7 1 4 1 7 1 3 6 9 9

input = 
3
345 124 54
5
123 221 325 4234 5167
output = 
4 6 8 3 4 5 3 7 9 4 2 3 4 5 1 6 7

'''


#solution

def find(l1,l2):
    result=[]
    if(len(l1)>len(l2)):
        l2 = l2 + [0]*(abs(len(l2) - len(l1)))
    elif(len(l1)<len(l2)):
        l1 = l1 + [0]*(abs(len(l2) - len(l1)))
    for i in range(len(l1)):
        result.append(l1[i]+l2[i])
    s = [str(i) for i in result]
    r = "".join(s)
    for i in r:
        print(i,end=" ")
if __name__=="__main__":
    m=int(input())
    l1=list(map(int,input().split()))
    n=int(input())
    l2=list(map(int,input().split()))
    find(l1,l2)
