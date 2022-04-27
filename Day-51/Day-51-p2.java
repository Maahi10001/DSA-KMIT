/*
 Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.

As a reminder, a binary search tree is a tree that satisfies these constraints:

--The left subtree of a node contains only nodes with keys less than the node's key.
--The right subtree of a node contains only nodes with keys greater than the node's key.
--Both the left and right subtrees must also be binary search trees.

note: output should be in pre order of new tree
example:
input =9
4 1 6 0 2 5 7 3 8
output =30 36 36 35 33 21 26 15 8

input =11
2 1 33 25 40 11 34 7 12 36 13
output=213 214 143 168 204 211 193 181 40 110 76
*/
//solution
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
    
    public Node convertBST(Node root) {
        
        convert(root);
        return root;
    }
    public void convert(Node r){
        
        if(r== null){
            return;
        }
        convert(r.right);
        r.key+=temp;
        temp=r.key;
        convert(r.left);
        //return r.val;
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
 
    void display() { display_bst(root); }
 
    void display_bst(Node root)
    {
        if (root != null) {
            System.out.print(root.key+" ");
            display_bst(root.left);
            display_bst(root.right);
        }
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
        p.convertBST(root);
        p.display();
    }
}
