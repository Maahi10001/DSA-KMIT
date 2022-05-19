'''You have d dice, and each die has f faces numbered 1, 2, ..., f.
Return the number of possible ways (out of fd total ways) modulo 10^9 + 7 to roll the dice so the
sum of the face up numbers equals target.

Example 1:
Input: d = 1, f = 6, target = 3
Output: 1
Explanation: 
You throw one die with 6 faces.  There is only one way to get a sum of 3.


input =
1 6 3
output = 1
first read d value, followed by f value and target value


Example 2:
2 6 7
output =6

d = 2, f = 6, target = 7
Output: 6
Explanation: 
You throw two dice, each with 6 faces.  There are 6 ways to get a sum of 7:
1+6, 2+5, 3+4, 4+3, 5+2, 6+1.

Example 3:
input =2 5 10
output =1

d = 2, f = 5, target = 10
Output: 1
Explanation: 
You throw two dice, each with 5 faces.  There is only one way to get a sum of 10: 5+5.

Example 4:
Input: d = 1, f = 2, target = 3
Output: 0
Explanation: 
You throw one die with 2 faces.  There is no way to get a sum of 3.
'''

def possible_ways(dice,faces,target):
    count=0
    if(dice==0 or faces==0):
        return dice==target
    for i in range(1,faces+1):
        count=count+(possible_ways((dice-1),faces,target-i)%100000007)
    return count
    '''count=0
    dic=[]
    for i in range(faces):
        dic.append(i+1)
    dic=dic*dice
    if(dice==1):
        if target in dic:
            return 1
        return 0
    print(dic)
    for i in range(len(dic)):
        for j in range(i+1,len(dic)):
            if(dic[i]+dic[j]==target):
                count+=1
    return count'''
        
if __name__=="__main__":
    dice,faces,target=map(int,input().split())
    print(possible_ways(dice,faces,target))