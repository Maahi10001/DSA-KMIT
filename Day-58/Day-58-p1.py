'''

Given an array nums with n objects three chocolates, cadbury , nestle, amul, sort them in-place so that objects of the same kind of chocolates are adjacent, with the type in the order cadbury , nestle , amul

you must solve the problem without using library's sort funtion.

ex:
input = 6
amul cadbury amul nestle nestle cadbury
output =cadbury cadbury nestle nestle amul amul

input =3
amul cadbury nestle
output =cadbury nestle amul

'''
def helper(n,arr,listt):
    res=[]
    dic={}
    for i in arr:
        if i not in dic:
            dic[i]=0
        dic[i]+=1
    for i in listt:
        if i in dic:
            x=dic.get(i)
            for z in range(x):
                res.append(i)
    return res
if __name__=="__main__":
    n=int(input())
    listt=["chocolates","cadbury","nestle","amul"]
    arr=list(map(str,input().split()))[:n]
    print(helper(n,arr,listt))
