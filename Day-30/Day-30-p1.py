'''
HDFC Credit card system generates bill on 1st day of a given month and gives 60 days period for repayment of the bill.
The manager of the bank wants to send an alert message to the customer every 'k' days ,  just to remind the bill payment. 
Kindly help the bank manager to send the customer a alert message every 'k' days of the bill start. 

The first line of input contains the date separated by the dd-MM-yyyy followed by the number of days 


input=01-05-2022
10
output= 
May 1, 2022 Bill Payment Due  on Thursday, June 30, 2022
May 11, 2022 Bill Payment Due  on Thursday, June 30, 2022
May 21, 2022 Bill Payment Due  on Thursday, June 30, 2022
May 31, 2022 Bill Payment Due  on Thursday, June 30, 2022
June 10, 2022 Bill Payment Due  on Thursday, June 30, 2022
June 20, 2022 Bill Payment Due  on Thursday, June 30, 2022


input=01-09-2021
15
output=
September 1, 2021 Bill Payment Due  on Sunday, October 31, 2021
September 16, 2021 Bill Payment Due  on Sunday, October 31, 2021
October 1, 2021 Bill Payment Due  on Sunday, October 31, 2021
October 16, 2021 Bill Payment Due  on Sunday, October 31, 2021

#solution incorrrect
from datetime import datetime,timedelta
import calendar
def getdt(d,m,y,n,s,d2,m2,y2,day2,s2,tempd,tempd2):
    months=["January","February","March","April","May","June","July","August","September","October","November","December"]
    if(m>0 and m<13):
        m_str=months[m-1]
    if(m2>0 and m2<13):
        m_str2=months[m2-1]
    date1='%s %d, %d' % (m_str,d,y)
    date2='%s %d, %d' % (m_str2,d2,y2)
    #dt=datetime.strptime(s,'%d %m %Y').weekday()
    Begindate = datetime.strptime(tempd, "%Y-%m-%d")
    Enddate = Begindate + timedelta(days=n)
    for i in range(n):
            Begindate = datetime.strptime(Begindatestring, "%Y-%m-%d")
            Enddate = Begindate + timedelta(days=10)
            Begindate = datetime.strptime(Begindatestring, "%Y-%m-%d")
            Enddate = Begindate + timedelta(days=10)
    print(date1," Bill Payment Due  on ",day2,date2)
    
    
    
if __name__=="__main__":
    s=input()
    n=int(input())
    d,m,y=s.split("-")
    tempd=y+"-"+m+"-"+d
    s=s.replace("-"," ")
    check2=datetime.strptime(tempd,'%Y-%m-%d')
    end1=str(check2+timedelta(days=60))
    end1=end1.split(" ")
    y2,m2,d2=end1[0].split("-")
    s2=d2+" "+m2+" "+y2
    tempd2=y2+"-"+m2+"-"+d2
    check3=datetime.strptime(s2,'%d %m %Y').weekday()
    day2=calendar.day_name[check3]
    print(getdt(int(d),int(m),int(y),n,day,s,int(d2),int(m2),int(y2),day2,s2,tempd,tempd2))'''
    #correct Solution
    import datetime
    if __name__=="__main__":
        l=list(map(int,input().split('-')))
        k=int(input())
        date1=datetime.date(l[2],l[1],l[0])
        date2=date1+datetime.timedelta(days=60)
        y=date2.strftime('%A, %-B %-d, %Y')
        a=int(60/k)
        datetemp=date1
        for i in range(a):
            x=datetemp.strftime('%B %-d, %Y')
            print(x,"Bill Payment Due on", y)
            datetemp=datetemp+datetime.timedelta(days=k)
