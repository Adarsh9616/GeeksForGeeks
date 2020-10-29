
/*
Structure of Node:
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

public class Tree
{
    // return true if the given tree is a BST, else return false
    boolean isBST(Node root)
        {
            return solve(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        boolean solve(Node root, int min ,int max)
        {
            if(root==null)
            {
                return true;
            }
            if(root.data<min||root.data>max)
            {
                return false;
            }
            return solve(root.left,min,root.data-1)&&solve(root.right,root.data+1,max);
        }
}