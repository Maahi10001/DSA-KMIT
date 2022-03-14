'''
you are given an array of integers with positive and negative numbers.

you should rearrange the elements of integers based on below conditions:
-- every consecutive pair of integers have alternate signs.
-- the output array begins with a positive integer.


example:

input =6
3 1 -2 -5 2 -4
output =3 -2 1 -5 2 -4


input = 2
-1 1
output =1 -1

'''

#solution
def alternate(l,n):
    t,x,y=[0]*n,0,1
    for i in l:
        if(i>0):
            t[x]=i
            x+=2
        else:
            t[y]=i
            y+=2
    return t
    '''
    #alternative approach
    
    pve,nve=[],[]
    for i in l:
        if(i>0):
            pve.append(i)
        else:
            nve.append(i)
    i,j=0,0
    while j<len(l):
        l[j]=pve[i]  #adding to odd
        l[j+1]=nve[i] #adding to even
        j+=2
        i+=1
    return l ''' 

if __name__=="__main__":
    n=int(input())
    l=list(map(int,input().split()))[:n]
    res=alternate(l,n)
    print(*res,sep=' ')
    