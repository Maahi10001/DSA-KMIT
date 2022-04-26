/*Given the root of a binary search tree(BST) and an integer val.
return the subtree rooted with that node. If such a node does not exist, return null.


example:
input =5
4 2 7 1 3
2
output =[2, 1, 3]

input =5
4 2 7 1 3
5
output=[]
*/

//solution
import java.util.*;

class Node
{
    int val;
    Node left;
    Node right;
    Node(int x){
         val=x;
         left=null;
         right=null;
    }
}


class Insert
{
       Node root=null;
       
       void correctposi(Node ptr,int ele,Node head)
       {
             if(head==null)return;
             if(head.val>ele)
             {
                 if(head.left==null){
                       head.left=ptr;
                       return;
                 }
                 correctposi(ptr,ele,head.left);
             }else{
                  
                  if(head.right==null){
                      head.right=ptr;
                      return;
                  }
                  correctposi(ptr,ele,head.right);
             }
       }
       
       void insertele(int ele)
       {
            Node ptr=new Node(ele);
            if(root==null)
            {
                root=ptr;
            }else{
                  correctposi(ptr,ele,root);
            }
       }
       
       Node findele(int k,Node head)
       {
           if(head.val==k)return head;
           if(head.val>k && head.left!=null)
           {
              return  findele(k,head.left);
           }
           else if(head.val<k && head.right!=null){
              return findele(k,head.right);
           }
           return null;
       }
       
       void preorder(Node ptr)
       {
           if(ptr==null)return;
          
           System.out.print(ptr.val+" ");
           if(ptr.left==null && ptr.right!=null){
               System.out.print("null ");
           }else if(ptr.left!=null && ptr.right==null){
               System.out.print("null ");
           }
           preorder(ptr.left);
           preorder(ptr.right);
       }
}
public class program
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Insert obj=new Insert();
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            obj.insertele(ele);
        }
        int sear=sc.nextInt();
        int arr[]=new int[0];
   // obj.preorder(obj.root);
    // System.out.println("**");
        Node ptr=obj.findele(sear,obj.root);
        if(ptr==null){
            System.out.println("[]");
        }else{
             obj.preorder(ptr);
        }
    }
}