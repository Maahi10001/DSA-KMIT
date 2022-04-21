'''
srinivas is trying to rearrange characters in word based on frequency 
of each character repeated number of times in that particular word.

example:
input =stff
output =ffst


input =fffbbb
output =fffbbb

both f and b appear three times , so answer would be fffbbb or bbbfff.
return in insertion order of when they both are same frequency. 
 
input =caAc
output =ccaA
'''
#solution --sort the string according to the frequencies  
  
  
from collections import Counter
def printfreq(s):
    res=""
    dic=Counter(s)  # counts all the frequencies of characters and store as dictionary(hashmap in java)
    dic=sorted(dic.items(),key=lambda x:-x[1]) # sorted the list according to the items i,e., freq value
    #print(dic)
    for i in dic:
        res+=i[0]*i[1]
        #print(res)
    return res
if __name__=="__main__":
    s=input()
    print(printfreq(s))  