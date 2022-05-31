/*
/*ajith is playing a game to find a words ,if he found the word return true othere wise return false.

for example:

input =
3 3
a b c
d e a
l m t
cat
output =true

Note: 
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells 
are horizontally or vertically neighboring. The same letter cell may not be used more than once.


example:2
input =3 4
a b c e
s f c s
a d e f
abcced
output =true


input =3 4
a b c e
s f c s
a d e e
see
output =true

input =4 4
a b c d
e f g h
i j k l
m n o p
abcdhlkjfm
output =false



*/

import java.util.*;

class Solution {
    
     boolean find=false;

    public  boolean isexists(char[][] board, String word,String pross,int r,int c, boolean visited[][]) {

        
          if(!word.startsWith(pross))return false;

           if(word.equals(pross)){
                    find=true;
                     //System.out.println("found");
                    return true;
           } 

        //    System.out.print(pross+"\t");

           if(pross.length()>word.length()){
               return false;
           }

           if(visited[r][c])return false;

           visited[r][c]=true;

           String ch=board[r][c]+"";
           if(r>0){
               boolean v=isexists(board,word,pross+ch,r-1,c,visited);
               if(v)return v;
           }

           if(c>0){
            boolean v=isexists(board,word,pross+ch,r,c-1,visited);
               if(v)return v;
           }

           if(r+1<board.length){
            boolean v=isexists(board,word,pross+ch,r+1,c,visited);
               if(v)return v;
           }

           if(c+1<board[0].length){
            boolean v= isexists(board,word,pross+ch,r,c+1,visited);
               if(v)return v;
           }
           visited[r][c]=false;

        return false;
    }


    public  boolean exist(char[][] board, String word, boolean visited[][]) {
        int i=0,j=0;
        if((board[0][0]+"").equals(word)){
            return true;
        }
        for(char[] arr:board){
               j=0;
               for(char s:arr){
                   String c=s+"";
                    if(c.equals(word.charAt(0)+""))
                    // System.out.println("nilesh");
                       if(isexists(board,word,"",i,j,visited)){
                                return true;
                       }
                       j++;
               }
               i++;
        }
        return find;
    }
    
    
    
    public boolean exist(char[][] board, String word) {
           boolean visited[][]=new boolean[board.length][board[0].length];
           return exist(board,word,visited);
    }
}



public class program
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        char[][] ch=new char[n][m];
        
        for(int i=0;i<n;i++){
             for(int j=0;j<m;j++)
             {
                 String s=sc.next();
                ch[i][j]=s.charAt(0);
                 
             }
            
        }
        
        String word=sc.next();
        
         Solution sc1=new Solution();
        System.out.println(sc1.exist(ch,word));
    }
    
}