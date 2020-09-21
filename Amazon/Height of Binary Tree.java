class Tree
{
    // return the Height of the given Binary Tree
    int height(Node root) 
    {
        return solve(root,0);
    }   
    int solve(Node root,int h)
    {
        if(root==null)
        {
            return h;
        }
        int l=solve(root.left,h);
        int r=solve(root.right,h);
        return Math.max(l,r)+1;
    }
}