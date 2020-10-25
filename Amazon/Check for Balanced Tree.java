//User function Template for Java


/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean ans=true;
    boolean isBalanced(Node root)
    {
	// Your code here
	    solve(root);
	    return ans;
    }
    int solve(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=solve(root.left);
        int r=solve(root.right);
        if(Math.abs(l-r)>1)
        {
            ans=false;
            return Integer.MAX_VALUE;
        }
        return Math.max(l,r)+1;
    }
}

