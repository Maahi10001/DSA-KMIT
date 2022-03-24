'''
Number Rangoli 

Swathi Prints the following Number Rongoli 
for any given positive integer 'n'

Help Swathi in this regard

input=4
output=
1*2*3*4*17*18*19*20
--5*6*7*14*15*16
---8*9*12*13
----10*11


The output should contain only - and * numbers(0-9)


input=3
output=
1*2*3*10*11*12
--4*5*8*9
---6*7


'''
#solution
if __name__ == "__main__":
	num =int(input())
	lt = 1
	rt = num * num + 1
	for i in range(num, -1, -1):
		for space in range(num-1, i-1, -1):
			print("--", end ="")
		for j in range(1, i + 1):
			print(str(lt)+"*", end ="")
			lt += 1
		for j in range(1, i + 1):
			print(rt, end ="")
			if j < i:
				print("*", end ="")
			rt += 1
		rt = rt - (i - 1) * 2 - 1
		print()

