
class Solution
{
    int index=0;
    public  Node buildTree(int inorder[], int preorder[], int n)
    {
        return solve(inorder,preorder,0,n-1);
    }
    public Node solve(int inorder[],int preorder[],int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        
        Node root=new Node(preorder[index++]);
        if(start==end)
        {
            return root;
        }
        int target=root.data;
        int newEnd=-1;
        for(int i=start;i<=end;i++)
        {
            if(inorder[i]==target)
            {
                newEnd=i;
                break;
            }
        }
        root.left=solve(inorder,preorder,start,newEnd-1);
        root.right=solve(inorder,preorder,newEnd+1,end);
        return root;
    }
}
