class Tree {
    /* Complete the function to get diameter of a binary tree */
    int ans=0;
    int diameter(Node root) 
    {
        solve(root);
        return ans;
    }
    int solve(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=solve(root.left);
        int right=solve(root.right);
        int temp=Math.max(left,right)+1;
        int res=Math.max(temp,left+right+1);
        ans=Math.max(ans,res);
        return temp;
    }
}
