'''
Given a word w, return the number of substrings with out duplicate characters of length 3 in w.

ex: 
input =xyzzaz
output =1
there are 4 substrings of size 3
xyz, yzz,zza,zaz
out of this only xyz has no duplicate characters so print 1.


ex:
input =aababcabc
ouput =4

there are 7 substrings of size 3
aab,aba,bab,abc,bca,cab,abc
from the above abc,bca,cab,abc are having unique characters.


'''
#solution
def countthestrings(s):
    x,y,count=0,1,0
    while(x<=len(s) and y<=len(s)):
        if(len(s[x:y])==3):
            if(len(set(s[x:y]))==3):
                print(s[x:y])
                count+=1 
            x+=1 
            y+=1
        else:
            y+=1
   
    '''count=0
    for i in range(len(s)):
        for j in range(i+1,len(s)+1):
            #print(s[i:j])
            if(len(s[i:j])==3):           #brute force
                #print(s[i:j])
                if(len(set(s[i:j]))==3):
                    count+=1'''
    return count
    #return False
            
if __name__=="__main__":
    s=input()
    print(countthestrings(s))