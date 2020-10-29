//User function Template for Java
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Tree
{ 
    Node head;
    Node prev=null;
    Node bTreeToClist(Node root)
    {
        if(root==null)
        {
            return null;
        }
        solve(root);
        head.left=prev;
        prev.right=head;
        return head;
    }
    void solve(Node root)
    {
        if(root==null)
        {
            return;
        }
        solve(root.left);
        if(prev==null)
        {
            head=root;
        }
        else
        {
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        solve(root.right);
        
    }
    
}
    
