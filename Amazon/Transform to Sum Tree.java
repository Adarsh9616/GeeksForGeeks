
/*Complete the Given Function
Node is as follows:
class Tree{
int data;
Tree left,right;
Tree(int d){
	data=d;
	left=null;
	right=null;
}
}*/
class Tree{
    public void toSumTree(Node root)
    {
        solve(root);
    }
    int solve(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int newVal=root.data;
        root.data=solve(root.left)+solve(root.right);
        return newVal+root.data;
    }
}