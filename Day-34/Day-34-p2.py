'''
UBER driver has a vehicle, daily he used go in only one direction.
Capacity of the vehicle is S (no of seats except driver seat), 

Given a list of N bookings, booking[i]= [ num_customers, pickup, drop ].
booking indicates, number of customers to pick up, and pick up, droping points.

Initially the vehicle is empty.

Return true if and only if it is possible to pick up and drop off all customers of all bookings.

Input Format:
-------------
Line-1 -> Two integers N and S, number of bookings and number of seats in the vehicle.
Next N Lines -> three space separated integers, num_customers, pickup point, dropping point

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
2 5
2 1 5
3 3 7

Sample Output-1:
----------------
true


Sample Input-2:
---------------
2 4
2 1 5
3 3 7

Sample Output-2:
----------------
false


Sample Input-3:
---------------
3 11
3 2 7
3 7 9
8 3 9

Sample Output-3:
----------------
true
'''
#solution:-
def pickupdrop(l,m):
        diff = [0 for i in range(1001)]
        for i in l:
            diff[i[1]] += i[0]
            diff[i[2]] -= i[0]
        accu_sum = 0
        for num in diff:
            accu_sum+=num
            if accu_sum>m:
                return False
        return True
if __name__=="__main__":
    n,m=map(int,input().split())
    l=[]
    for i in range(n):
        a=list(map(int,input().split()))
        l.append(a)
    if(pickupdrop(l,m)):
        print("true")
    else:
        print("false")
