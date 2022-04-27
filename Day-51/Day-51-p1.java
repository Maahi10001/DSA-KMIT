/*

Given a BST , find the lowest common ancestor of two given nodes in the BST

example:
input =11
2 1 33 25 40 11 34 7 12 36 13
25 40
output =33


input =11
2 1 33 25 40 11 34 7 12 36 13
1 36
output =2

input =9
6 2 8 0 4 7 9 3 5
2 4
output =2

input =9
6 2 8 0 4 7 9 3 5
5 9
output =6

*/
//solution loswer common ansector
import java.util.*;
class program{ 
    int temp=0;
    class Node {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
    static Node root;
    program() { root = null; }
 
    program(int value) { root = new Node(value); }
 
    void insert(int key) { root = insertRec(root, key); }
    
    public Node LCA(Node root,int x,int y) {
        if(root==null){
            return null;
        }
        if(x<root.key && y<root.key){
            return LCA(root.left,x,y);
        }
        else if(x>root.key && y>root.key){
            return LCA(root.right,x,y);
        }
        else{
            return root;
        }
    }
    Node insertRec(Node root, int key)
    {
 
           
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        return root;
    }
 
    public static void main(String []args){
        program p=new program();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            p.insert(arr[i]);
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        Node temp=p.LCA(root,x,y);
        System.out.print(temp.key);
        //p.display();
    }
}
