/*Ramesh is travelling countries either by air transport or sea transport (air represents 1 and sea  represents 0). if he visited any country through sea(ie 0) then he will travel all of it's left side ,right side ,upside and downside countries will visit by sea transport.

ex:
input =3 3
1 1 1
1 0 1
1 1 1
output =
1 0 1
0 0 0
1 0 1

Ramesh will travel all of its left right, down and up by sea transport so change values of 1's to zero of same row and same column

  0
 000
  0
so final output would be 
1 0 1
0 0 0
1 0 1



ex: 2
input =3 4
0 1 2 0
3 4 5 2
1 3 1 5
output =
0 0 0 0
0 4 5 0
0 3 1 0

*/

import java.util.*;
class program{
    public static int[][] makezeros(int r,int c,int[][] arr){
        Set<Integer> x = new HashSet<Integer>(); 
        Set<Integer> y =new HashSet<Integer>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==0){
                    x.add(i);
                    y.add(j);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(x.contains(i) || y.contains(j)){
                    arr[i][j]=0;
                }
            }
        }
    return arr;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]mat=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        makezeros(r,c,mat);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}