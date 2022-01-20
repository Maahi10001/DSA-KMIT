'''
 
Vikram a third class boy plays with a numbers, he will be given a number(n) and 
he starts writing the numbers on each line until he reaches the number(n).

Write the code and verify if the vikrams writing of the number is same or not. 

Assume n>=1


input = 5
output =
1
1 2
3 5 8
13 21 34 55
89 144 233 377 610


input = 4
output = 
1
1 2
3 5 8
13 21 34 55



'''
#solution
def func(n):
    x,y=1,0
    for i in range(0,n):
        for j in range(0,i+1):
            if(i==0):
                print(1,end="")
            else:
                z=x+y 
                print(z,end=" ")
                y,x=x,z
        print("\r")
if __name__=="__main__":
    n=int(input())
    func(n)