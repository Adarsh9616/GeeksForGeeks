class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        solve(root,ans);
        return ans;
    }
    void solve(Node root,ArrayList<Integer> ans)
    {
        if(root==null)
        {
            return ;
        }
        solve(root.left,ans);
        ans.add(root.data);
        solve(root.right,ans);
    }
}