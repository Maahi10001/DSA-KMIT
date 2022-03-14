'''
Given a word w, return number of righteous subwords of length 4 in w.

A word is righteous if there are no duplicate characters.

example:
input =wxyzzaz
output =1

there are 4 sub-words with size 4: wxyz,xyzz,yzza,zzaz.
righteous subwords from the above 4 is only one wxyz with no duplicate character.


input =abcddcbaabcd
output =3

there are 9 sub-words with size 4:
abcd,bcdd,cddc,ddcb,dcba,cbaa,baab,aabc,abcd.
righteous subwords from the above 9 are three words abcd, dcba, abcd
with no duplicate character.
Note:  if there are multiple occurrences of the same subword, every occurrence should be counted.


input =abcdabcdabcd
output =9
abcd,bcda,cdab,dabc,abcd,bcda,cdab,dabc,abcd
'''
#solution

def splitstr(s,m):
    i=0
    j=m
    count=0  #sliding window approach
    for x in range(len(s)):
        temp=set(s[i:j])
        if(len(temp)==4):
            count+=1
        i+=1
        j+=1
    return count
if __name__=="__main__":
    s=input()
    m=4
    print(splitstr(s,m))