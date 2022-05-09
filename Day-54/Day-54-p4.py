'''
Given a list of dates, sort them in ascending order, Dates are described below

Each date is in the form dd mmm yyyy where  
dd has 0-31
mmm has Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
yyyy is four digits

For Example dates = [’01 Mar 2017’,’03 Feb 2017’,’15 Jan 1998’] would sort to 
[’15 Jan 1998’,’03 Feb 2017’,’01 Mar 2017’];


input =
20 Oct 2052
06 Jun 1933
26 May 1960
20 Sep 1958
16 Mar 2068
25 May 1912
16 Dec 2018
26 Dec 2061
04 Nov 2030
28 Jul 1963
output =
25 May 1912
06 Jun 1933
20 Sep 1958
26 May 1960
28 Jul 1963
16 Dec 2018
04 Nov 2030
20 Oct 2052
26 Dec 2061
16 Mar 2068




'''



months=dict()
def sorting():
	months["Jan"] = 1
	months["Feb"] = 2
	months["Mar"] = 3
	months["Apr"] = 4
	months["May"] = 5
	months["Jun"] = 6
	months["Jul"] = 7
	months["Aug"] = 8
	months["Sep"] = 9
	months["Oct"] = 10
	months["Nov"] = 11
	months["Dec"] = 12

def cmp(date):
    #print(date)
    date=date.split()
    return int(date[2]),months[date[1]],int(date[0]),
# Driver code
if __name__ == '__main__':
    n=int(input())
    dates=[]
    for i in range(n):
        s=input()
        dates.append(s)
    #print(dates)
    sorting() 
    dates.sort(key=cmp) 
    for i in range(n):
	    print(dates[i])
		

    