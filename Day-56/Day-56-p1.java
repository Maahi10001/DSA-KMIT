/*
Dougs was doing him math homework with two of his friend at one point they all got bored but Dougs had
an idea to pass the time in an interesting way he decided to play game of difference such that 
given sequence of the integers a, a triplet(a[i], a[j], a[k]) is beautiful if:

1) i < j < k
2) a[j] - a[i] = a[k] - a[j] = d

Given an increasing sequence of the integers and the value of d, count the number of beautiful 
tripplet in the sequence.
output : the number of beautiful triplets

Input Format
This first line contains 2 space-sepreted integers n and d the length of the sequence
and the beautiful difference. The second line contains n space-seprated integer ar[i].

input =5 1
2 2 3 4 5

there are three beautiful triplets by index [i,j,k]=[0,2,3][1,2,3][2,3,4].
to test first triplet [0,2,3] 
arr[j]-arr[i]=3-2=1
arr[k]-arr[j]=4-3=1
similarly [1,2,3][2,3,4]



input =7 3
1 2 4 5 7 8 10
output =3

there are many possible triplets(arr[i],arr[j],arr[k]),
but our only beautiful triplets are (1,4,7),(4,7,10),(2,5,8) by value, not index,

7-4=4-1=3=d
10-7=7-4=3=d
8-5=5-2=3=d


input =10 3
1 6 7 7 8 10 12 13 14 19
output =2


*/
import java.util.*;
class program 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {  int v=sc.nextInt();
            a.add(v);
        }
        int c=0;
        for(int i=0;i<a.size();i++)
        {
            if(a.contains(a.get(i)+d))
            {
                if(a.contains(a.get(i)+d+d))
                c++;
            }
        }
        System.out.println(c);
    }
}