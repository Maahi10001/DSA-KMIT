'''
In a Maths class, the maths teacher gives a number 'n' to students, along with the number 
she also gives another number 'k',
the students of the class are supposed to give a new number after removing the k digits 
from the given number.   
note:- remove k digits such that it forms smallest number possible


input = 157654
3
output=154


input=1432219
3
output=1219
'''
#solution
def work(s, n):
		a = []
		# implemening increasing stack
		for i in range(len(s)):
			while a and a[-1] > s[i] and len(s) - i + len(a) > len(s) - n:
				a.pop()
			a.append(s[i])
		if len(a) > len(s) - n:
			return str(int("".join(a[:len(s) - n]))) if len(s) != n else "0"

		return str(int("".join(a)))
if __name__=="__main__":
    s=input()
    n=int(input())
    print(work(s,n))
'''
solution explanation
157654
3
['1']
['1', '5']              #printing a when appending
['1', '5', '7']         
7 #priting the popped element.
['1', '5', '6']
6
['1', '5', '5']
5
['1', '5', '4']
154

'''