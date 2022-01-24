'''
Door Numbering


Shyam is building an application where he wants to write the numbers of the doors in a special way . 
He will use the 7 different symbols (I,V,X,L,C,D,M)
Each symbol will have the value 
(I-1,V-5,X-10,L-50,C-100,D-500,M-1000)

For example, 2 is written as II , just two one's added together. 
12 is written as XII , which is simply X + II .
The number 27 is written as XXVII , which is XX + V + II .

Rules followed
The numbers  are usually written largest to smallest from left to right. 
However, the numeral for four is not IIII . Instead, the number four is written as IV . 
Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX . 

There are six instances where subtraction is used:
• I can be placed before V (5) and X (10) to make 4 and 9.
• X can be placed before L (50) and C (100) to make 40 and 90.
• C can be placed before D (500) and M (1000) to make 400 and 900.

input=3
output=III


input=45
output=XLV


input=88
output=LXXXVIII

Help Shyam in building the application. 
Assume the door Nos are between 1 to 3999 only 

'''
#solution
def func(n):
    roman=(1000,900,500,400,100,90,50,40,10,9,5,4,1)
    nums=('M','CM','D','CD','C','XC','L','XL','X','IX','V','IV','I')
    res=""
    for i in range(len(roman)):
        c=int(n/roman[i])
        res +=str(nums[i]*c)
        n=n-roman[i]*c
    return res
if __name__=="__main__":
    n=int(input())
    print(func(n))