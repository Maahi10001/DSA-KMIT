/*Somesh is working on Number Strings.
He got an idea to find the smallest possible number by 
deleting some digits from the number without changing 
the relative order of digits in it.

You will be given a integer String 'num', and an integer n.
Find the smallest number possible after deleting n digits from 'num'.

Note: If the number string 'num' turns to empty, print 0.

Input Format:
-------------
Line-1 : A string num, consist of digits only.
Line-2 : An integer n, number of digits to delete.

Output Format:
--------------
Print the smallest possible number.


Sample Input-1:
---------------
1432219
3

Sample Output-1:
----------------
1219

Explanation: 
------------
Delete the three digits 4, 3, and 2 to form the smallest number 1219.


Sample Input-2:
---------------
10200
1

Sample Output-2:
----------------
200

Explanation:
------------
Delete the leading 1 and the smallest number is 200. 
Note that the output must not contain leading zeroes.

*/

#include <bits/stdc++.h>
using namespace std;
class program{
    public:
        string get_min_num(string s,int n){
            int len=s.size();
            stack<char> st;
            for(char c:s){
                while(!st.empty() && n>0 && st.top()>c){
                    st.pop();
                     n--;
                }
                if(!st.empty() || c!='0')
                    st.push(c);
            }
            while(!st.empty() && n--)  
                st.pop();
            if(st.empty()) 
                return "0";
            while(!st.empty()){
                s[len-1]=st.top();
                st.pop();
                len--;
            }
            return s.substr(len);
        }
};
int main(){
    program p;
    string s;int n;
    cin>>s>>n;
    cout<<p.get_min_num(s,n);
}