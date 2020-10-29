
/* A Binary Tree node
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
class Tree
{
    boolean ans=true;
	boolean isSumTree(Node node)
	{
	    solve(node);
	    return ans;
	}
	int solve(Node node)
	{
	    if(node==null)
	    {
	        return 0;
	    }
	    if(node.left==null&&node.right==null)
	    {
	        return node.data;
	    }
	    int l=solve(node.left);
	    int r=solve(node.right);
	    if(node.data!=l+r)
	    {
	        ans=false;
	    }
	    return node.data+l+r;
	}
}
