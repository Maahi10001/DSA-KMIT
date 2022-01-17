'''

Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, 
return a sorted array of only the integers that appeared in all three arrays in increasing order

For any other Boundary Conditions Print -1 
Assume all the three input array contains positive elements 

The first line of input contains the first array elements followed by second array elements followed by third array elements 

input =
1 2 3 4 5 11 15
1 2 5 7 
1 3 4 5 8 20 45 55
output = 
1 5

Explanation: Only 1 and 5 appeared in the three arrays.


input = 
3 4 4 5 6 7
40 50 60 70 80 90
500 600
output = -1


input = 
1 1 1 2
1 1 
1 2 3 4 5
output = 1

'''

#solution
def func(s1,s2,s3):
    s1=set(s1)
    #print(s1)
    s2=set(s2)
    #print(s2)
    s3=set(s3)
    #print(s3)
    if(s1 & s2 & s3):
        s=list(s1 & s2 & s3)
        s.sort()
        return s
    else:
       return -1
    

if __name__=="__main__":
    s1=list(map(int,input().split()))
    s2=list(map(int,input().split()))
    s3=list(map(int,input().split()))
    print(func(s1,s2,s3))
    