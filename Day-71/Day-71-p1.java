/*
Given two numbers n1 and n2, convert all numbers in binary format and return the count of numbers in the inclusive range n1, n2 having a prime number of set bits . 


Note : Don't use bitCount() function


input =6 10
output =4
for 6 in binary format 110 (2 set bits , and 2 is prime)
for 7 in binary format 111 (3 set bits , and 3 is prime)
for 8 is in binary format 1000 (1 set bit , and 1 is not prime)
for 9 is in binary format 1001 (2 set bits , and 2 is prime)
for 10 is in binary format 1010 (2 set bits , and 2 is prime)
so output is 4

input =10 15
output =5
for 10 in binary format 1010 (2 set bits , and 2 is prime)
for 11 in binary format 1011 (3 set bits , and 3 is prime)
for 12 in binary format 1100 (2 set bits , and 2 is prime)
for 13 in binary format 1101 (3 set bits , and 3 is prime)
for 14 in binary format 1110 (3 set bits , and 3 is prime)
for 15 in binary format 1111 (4 set bits , and 4 is not prime)
so output is 5.


*/
import java.util.*;
class Test{
    public static int getCount(int ip1,int ip2){
        int count=0;
        for(int i=ip1;i<=ip2;i++){
            String bin=Integer.toBinaryString(i);
            int bitCount=getBitCount(bin);
            if(isPrime(bitCount)){
                count++;
            }
        }
        return count;
    }
    public static int getBitCount(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(getCount(x,y));
    }
}