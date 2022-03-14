'''
Given a mXn matrix print the matrix in the following format.
sort the each matrix elements of diagonal in ascending order.

example:
input =
3
3
9 6 3
8 5 2
7 4 1
output =
1 2 3
4 5 6
7 8 9


input =
3
4
3 3 1 1
2 2 1 2
1 1 1 2
output =
1 1 1 1
1 2 2 2
1 2 3 3


'''
#solution
def sortmat(a):
    def diag(i,j):
        l1,l2=[],[]
        while i<len(a) and j<len(a[0]):
            l1.append((i,j))
            l2.append(a[i][j])
            i+=1
            j+=1
        l2.sort()
        for i,x in enumerate(l1):
            a[x[0]][x[1]]=l2[i]
    for i in range(len(a)):
        diag(i,0)
    for i in range(1,len(a[0])):
        diag(0,i)
    return ('\n'.join([' '.join([str(i) for i in j]) for j in a]))
    

if __name__=="__main__":
    n=int(input())
    m=int(input())
    mat=[]
    for x in range(n):
        mat.append([int(y) for y in input().split()])
    print(sortmat(mat))
    
    