/*
write a program to prrint the following pattern for any given integer n

input = 4
********
#******#
##****##
###**###
########



input = 7
output = 
**************
#************#
##**********##
###********###
####******####
#####****#####
######**######
##############
*/


import java.util.*;
class program{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print('#');
            }
            for(int k=i;k<2*n-i;k++){
                System.out.print('*');
            }
            for(int j=2*n-i;j<2*n;j++){
                System.out.print('#');
            }
            System.out.println();
        }
    }
}