'''
Siddarth is working with a list of integers, 0-indexed list.
The list is said to be decent list, if the sum of the inteers at odd indices
equal to the sum of integers at even indices in the list.

Now, siddarth can choose any index position, and delete the element from the list.
and check whether the resultant list is a decent list or not.
Due to the deletion of an element, the index postions may vary.

For example, if the list is [2,1,3,4,1] :
- delete the element at index 1 => list is [2,3,4,1]
- delete the element at index 2 => list is [2,1,4,1]
- delete the element at index 3 => list is [2,1,3,1]
- delete the element at index 4 => list is [2,1,3,4]

Siddarth has to find out how many indices you can remove one at a time and,
check that the resultant list becomes a decent list.

Your task is to help siddarth to find the count of all such indices.

Input Format:
-------------
Line-1: An integer N, number of elements in the list.
Line-2: N space separated integers, the list.

Output Format:
--------------
Print an integer, number of indices you can find.


Sample Input-1:
---------------
5
1 2 2 1 2

Sample Output-1:
----------------
1


Sample Input-2:
---------------
5
2 2 2 2 2

Sample Output-2:
----------------
5


Sample Input-3:
---------------
4
3 2 7 5

Sample Output-3:
----------------
1

'''
#solution
def getthepossible(n,l):
    x,count=0,0
    while(x<n):
        oddsum,evensum=0,0
        temp=list(l)
        temp.pop(x)
        #print(temp)
        for i in range(len(temp)):
            if i%2==0:
                evensum+=temp[i]
                #print(evensum)
            else:
                oddsum+=temp[i]
                #print(oddsum)
        temp.clear()
        x+=1
        
        if(evensum==oddsum):
            count+=1
    return count
if __name__=="__main__":
    n=int(input())
    l=list(map(int,input().split()))
    print(getthepossible(n,l))
    