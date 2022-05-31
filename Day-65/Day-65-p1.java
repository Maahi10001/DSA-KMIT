/*
Ravi is generating a binary sequenence for given n by using following rules:

first number in sequence="0"
other numbers can be find using the following formula
s[i]=s[i-1]+"1"+reverse(invert(s[i-1]))  for every i >0

here + means concatenation 
reverse(x) returns the reversed string x 
invert(x) inverts all the bits in x ( 0 changes to 1 and 1 changes to 0 ).

first four strings in the above sequence are:

for n=1 then "0"
for n=2 then "011"
for n=3 then "0111001"
for n= 4 then "011100110110001"

after generting sequence ravi should read the value of k and return kth bit for 
nth sequence string

input =3
3
output =1
for n=3 then sequence is "0111001" and 3rd bit is 1


input = 4
12
output =0 then sequence is "011100110110001" and 12th bit is 0

*/
import java.util.*;
class program{
   /* public static String invert(String s){
        StringBuilder sb=new StringBuilder();
        for(int l=s.length(),i=l-1;i>=0;i--){
            sb.append(s.charAt(i)=='0'?'1':'0');
        }
        return sb.toString();
    }
    public char find(int n, int k) {
       StringBuilder s=new StringBuilder();
        s.append('0');
        for(int i=2,l=1;i<=n;i++){
            l=l*2+1;
            String rev=invert(s.toString());
            s.append("1");
            s.append(rev);
        }
        return s.charAt(k-1); 
    }
    */
    import java.util.*;
    class program{
       /* public static String invert(String s){
            StringBuilder sb=new StringBuilder();
            for(int l=s.length(),i=l-1;i>=0;i--){
                sb.append(s.charAt(i)=='0'?'1':'0');
            }
            return sb.toString();
        }
        public char find(int n, int k) {
           StringBuilder s=new StringBuilder();
            s.append('0');
            for(int i=2,l=1;i<=n;i++){
                l=l*2+1;
                String rev=invert(s.toString());
                s.append("1");
                s.append(rev);
            }
            return s.charAt(k-1); 
        }
        */
        public static char invert(char c) {
            if(c == '0') return '1';
            else return '0';
        }
        public static char get_num_at_index(int n, int k) {
            if(n==1 && k==1) return '0';
            int length = (int)Math.pow(2,n) - 1;
            int mid = length / 2;
            if(k <= mid) return get_num_at_index(n-1, k);
            else if(k > mid + 1) return invert(get_num_at_index(n-1, length + 1 - k));
            else return '1';
        }
        
        
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.print(get_num_at_index(n,k));
        }
    }