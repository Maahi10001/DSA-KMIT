s = input()
el = []
count = 0
for i in range(len(s)):
	for j in range(i,len(s)):
		el.append(s[i:j+1])

print(*el)
for i in el:
  counte,counto=0,0
  if(len(i) > 0):
    s1 = list(i)
    d={}
    for j in s1:
      if j in d:
        d[j] += 1
      else:
        d[j] = 1

    for j in d.keys():
      if d[j]%2==0:
        counte+=1
      else:
        counto+=1

    if(counte>=0 and (counto==0 or counto==1)):
      count+=1
print(count)