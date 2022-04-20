'''
Prabhu is playing a game. 
As Part of this game at any given time he can score 3 or 5 or 10 points.
If the Target Score is Given to Prabhu. 
Find the total number of Possibility he can get the Score.

input = 13
output = 2

Explanation - 
3 5 5
3 10

Two Ways to reach the Target.

input = 20
output = 4

Explanation-
10 10
5 5 10
5 5 5 5 
3 3 3 3 3 5

'''

#solution

def func(n):
    arr = [0 for i in range(n+1)]
	arr[0] = 1
	for i in range(3, n+1):
		arr[i] += arr[i-3]
	for i in range(5, n+1):
		arr[i] += arr[i-5]
	for i in range(10, n+1):
		arr[i] += arr[i-10]

	return arr[n]
if __name__=="__main__":
    n = int(input())
    print(func(n))
