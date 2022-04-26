'''
DPS school will run school buses from one location to 
differnt locations(ie routes) where 
routes[i]=[locationA, locationB]
Given n routes return the last stop location of the school bus. 

input =3
nagole uppal
uppal habsiguda
habsiguda nacharam

output =nacharam
Explanation: Starting at "nagole" busses will reach "nacharam" 
which is the last stop. bus route consist of "nagole" -> "uppal" -> "habsiguda" -> "nacharam".


input =3
tarnaka narayanaguda
uppal tarnaka
narayanaguda mahenderahills
output =mahenderahills

Explanation: All possible routes are:
uppal-> tarnaka -> narayanaguda->mahenderahills or
tarnaka -> narayanaguda -> mahenderahills
narayanaguda -> mahenderahills
'''
#solution
stops=int(input())
mat=[]
laststop=''
col=[]
for i in range(stops):
    a,b=map(str,input().split())
    col.append(a)
    l=[]
    l.append(a)
    l.append(b)
    mat.append(l)
for i in range(stops):
    if mat[i][1] not in col:
        laststop=mat[i][1]
        break
print(laststop)