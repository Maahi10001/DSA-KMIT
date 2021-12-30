'''


Rahul is given a row of numbers where each row and columns are same. 
Rahul now prints the numbers of the rows as shown in the following manner. 
Help Rahul to write the code .

The first line of input consists of the size followed by the row numbers. 

Sample Input:
3
1 2 3 
4 5 6
7 8 9


Explanation:

1<-2<-3 
|
4->5->6
             |
7<-8<-9
   

Sample Output: 
3 2 1 4 5 6 9 8 7
'''
#solution
def func(matrix):
    matrix_2 = []
    for i in range(len(matrix)):
        if(i==0):
            matrix_2.append(matrix[i][::-1])
        elif(i%2==0):
            matrix_2.append(matrix[i][::-1])
        else:
            matrix_2.append(matrix[i])
    return matrix_2
if __name__=="__main__":
    R=int(input())
    matrix=[]
    for i in range(R):
        a=list(map(int,input().split()))
        matrix.append(a)
    matrix_2=func(matrix)
    for rows in matrix_2:
    	print(*rows,end=" ")
