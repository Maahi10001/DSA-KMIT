'''
Given a sorted array of distinct integers and a target value, 
return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.


Example 1:
input =4
1 3 5 6
5
output =2


input =4
1 3 5 6
2
output =1


'''
#solution

def getind(n,l,k):
    if k in l:
        return l.index(k)
    else:
        l.append(k)
        l.sort()
        return l.index(k)
               
if __name__=="__main__":
    n,l,k=int(input()),list(map(int,input().split())),int(input())
    print(getind(n,l,k))