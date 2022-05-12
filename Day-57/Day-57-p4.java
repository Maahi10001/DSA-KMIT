/*
Find Maximum are for given sequence of plots
In a layout of plots, all plots are having equal width, which is 10 meters, but these

plots varies in length For a given sequence of plots lengths, you need find what is maximum
rectangle area you can make ?

Example


Max Area is 4*10*20 = 800 sq meters

input =30 40 25 20
output =800

input =20 20 20 60 10 50 40 20 20 20 20
utput
1200

*/
import java.util.*;
class program {
    public static int maximumarea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int res = 0, n = heights.length;
        for(int i = 0 ; i<heights.length ; i++){
            while( st.isEmpty()==false && heights[st.peek()]>=heights[i] ){
                int val = heights[st.pop()];
                int left = st.isEmpty() ? -1 : st.peek();
                res = Math.max((i-left-1)*val, res);
            }
            st.push(i);
        }
        while(st.isEmpty()==false){
             int val = heights[st.pop()];
             int left = st.isEmpty() ? -1 : st.peek();
             res = Math.max((n-left-1)*val, res);
        }
        return res*10;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []st=s.split(" ");
        int []heights=new int[st.length];
        for(int i=0;i<st.length;i++){
            heights[i]=Integer.valueOf(st[i]);
        }
        System.out.print(maximumarea(heights));
    }
}