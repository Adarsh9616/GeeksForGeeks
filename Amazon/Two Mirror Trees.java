
// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree {
    boolean areMirror(Node a, Node b) 
    {
        if(a==null&&b==null)
        {
            return true;
        }
        if(a==null||b==null)
        {
            return false;
        }
        return a.data==b.data&&areMirror(a.left,b.right)&&areMirror(a.right,b.left);
    }
}