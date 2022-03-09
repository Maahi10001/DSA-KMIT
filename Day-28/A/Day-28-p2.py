'''
Tinku a Second Class Student is given a Phrase which contains few words in {}
His teacher marked all dificult words in the { }. 
His teacher gave him the meaning to the difficult words 
he was asked to replaced the difficult words in the { } with the meanings given to him. 

if the difficult word doesnt exist print ?

The first line of input contains the phrase followed by difficult words 
Each difficult words is given by a name followed by meaning (n difficult words)


input={name}isa{gender}
name ajay gender boy
output=ajayisaboy


input={name}is{age}yearsold
name bob age two
output=bobistwoyearsold


input=hi{name}
a b
output=hi?

'''
#solution
'''def find(s,l,temp):
    if len(l)%2==0:
        d=dict([(x, y) for x, y in zip(l[::2], l[1::2])]) 
    for i in temp:
        if i in d.keys():
            s=s.replace(i,d[i])
        else:
            s=s.replace(i,"?")
    s=s.replace("{","")
    s=s.replace("}","")
    return s
def wordinpar(s):
    s=s.split('{')
    temp=[]
    for i in range(1,len(s)):
        temp.append(s[i].split('}')[0])
    return temp
if __name__=="__main__":
    s=input()
    l=list(map(str,input().split()))
    #s=s.replace("{","")
    #s=s.replace("}","")
    temp=wordinpar(s)
    print(find(s,l,temp))'''

def find(s,l):
    d={k:v for k,v in l}
    temp=0
    res=[]
    s+="{"
    for i,j in enumerate(s):
        if j=="{":
            res.append(s[temp:i])
            temp=i 
        if j=="}":
            a=s[temp+1:i]
            res.append(d.get(a,'?'))
            temp=i+1 
    return ''.join(res)
    
if __name__=="__main__":
    s=input()
    l=list(map(str,input().split()))
    t1=[]
    for i in range(0,len(l),2):
        t2=[]
        t2.append(l[i])
        t2.append(l[i+1])
        t1.append(t2)
    print(find(s,t1))