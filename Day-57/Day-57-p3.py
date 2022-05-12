'''You are given a string s.

A split is called good if you can split s into two non-empty strings sleft and sright where their concatenation is equal to s (i.e., sleft + sright = s) and the number of distinct letters in sleft and sright is the same.

Return the number of good splits you can make in s.

 
input =aacaba
output: 2

Explanation: There are 5 ways to split "aacaba" and 2 of them are good. 
("a", "acaba") Left string and right string contains 1 and 3 different letters respectively.
("aa", "caba") Left string and right string contains 1 and 3 different letters respectively.
("aac", "aba") Left string and right string contains 2 and 2 different letters respectively (good split).
("aaca", "ba") Left string and right string contains 2 and 2 different letters respectively (good split).
("aacab", "a") Left string and right string contains 3 and 1 different letters respectively.


Example 2:
input = abcd
Output: 1

Explanation: Split the string as follows ("ab", "cd").




'''
def goodsplit(s):
    count=0
    for i in range(len(s)):
        split1,split2="",""
        split1=s[0:i+1]
        split2=s[i+1:len(s)]
        #print(split1,split2)
        if(len(set(split1))==len(set(split2))):
            if((split1+split2)==s):
                count+=1
    return count
if __name__=="__main__":
    s=input()
    print(goodsplit(s))