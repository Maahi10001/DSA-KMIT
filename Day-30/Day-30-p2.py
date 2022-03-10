'''
Given two dates print the number of  days between those given dates

input date format is  YYYY-MM-DD Format 

input = 2000-05-01
2020-01-01
output= 7184

input=2000-01-01
2000-12-31
output=365
'''
#solution
from datetime import date
def getdays(y1,y2,m1,m2,d1,d2):
    d0 = date(y1, m1, d1)
    d1 = date(y2, m2, d2)
    delta = d1 - d0
    return delta.days
if __name__=="__main__":
    date1=input()
    date2=input()
    y1,m1,d1=date1.split("-")
    y2,m2,d2=date2.split("-")
    print(getdays(int(y1),int(y2),int(m1),int(m2),int(d1),int(d2)))