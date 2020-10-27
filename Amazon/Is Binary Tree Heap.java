
/*
A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class GfG
{
    /*You are required to complete this method */
    boolean isHeap(Node tree)
    {
        if(tree==null)
        {
            return true;
        }
        int l=-Integer.MIN_VALUE;
        int r=-Integer.MIN_VALUE;
        if(tree.left!=null)
        {
            l=tree.left.data;
        }
        if(tree.right!=null)
        {
            r=tree.right.data;
        }
        if(tree.data<l||tree.data<r)
        {
            return false;
        }
        return tree.data>r&&tree.data>l&&isHeap(tree.left)&&isHeap(tree.right);
    }
}