/*
given a mxn matrix and given source cell and destination cell. find the shortest path between a given source cell to destination celll. 

ex:
input =3 3 
1 1 1
1 1 1
1 1 1
0 0
2 2
output=4

input =5 5
1 0 0 1 1
1 0 0 1 1
1 0 0 1 0
1 1 1 1 1
1 1 0 1 1 
4 1
0 4   
output =7


*/
import java.util.*;
class Node{
    int x,y,dist;
    Node(int x,int y,int dist){
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
}
class Test{
    private static int[] row={-1,0,0,1};
    private static int[] col={0,-1,1,0};
    private static boolean isValid(int m,int n,int [][]matrix, boolean[][] visited,int row,int col){
        return (row>=0)&& (row<m)&&(col>=0)&&(col<n)&&matrix[row][col]==1&&!visited[row][col];
    }
    private static int shortest_path(int m,int n,int [][] matrix,int i,int j,int x,int y){
        if(matrix==null||matrix.length==0||matrix[i][j]==0||matrix[x][y]==0){
            return -1;
        }
        boolean[][] visited=new boolean[m][n];
        Queue<Node> q=new ArrayDeque<>();
        visited[i][j]=true;
        q.add(new Node(i,j,0));
        int min_dist=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            Node node=q.poll();
            i=node.x;
            j=node.y;
            int dist=node.dist;
            if(i==x&&j==y){
                min_dist=dist;
                break;
            }
            for(int k=0;k<4;k++){
                if(isValid(m,n,matrix,visited,i+row[k],j+col[k])){
                    visited[i+row[k]][j+col[k]]=true;
                    q.add(new Node(i+row[k],j+col[k],dist+1));
                }
            }
        }
        if(min_dist!=Integer.MAX_VALUE){
            return min_dist;
        }
        return -1;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        System.out.print(shortest_path(m,n,matrix,s1,s2,d1,d2));
    }
}