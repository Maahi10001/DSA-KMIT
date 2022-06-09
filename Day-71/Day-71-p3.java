import java.util.*;
class Test{
    public static ArrayList<Integer>getList(int[]arr,int t,int x){
        ArrayList<Integer>al=new ArrayList<>();
        int right=arr.length-1;
        int left=0;
        while(right-left>=t){
            if((Math.abs(arr[left]-x)>Math.abs(arr[right]-x))){
                left++;
            }
            else{
                right--;
            }
        }
        for(int i=left;i<=right;i++){
            al.add(arr[i]);
        }
        return al;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int T=sc.nextInt();
        int X=sc.nextInt();
        int []trees=new int[N];
        for(int i=0;i<N;i++){
            trees[i]=sc.nextInt();
        }
        List<Integer>res=getList(trees,T,X);
        System.out.println(res);
    }
}