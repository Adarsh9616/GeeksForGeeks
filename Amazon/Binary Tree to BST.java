
//User function Template for Java

/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */


class GfG
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    ArrayList<Integer> ar=new ArrayList<>();
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       transform(root);
       Collections.sort(ar);
       return solve(ar,0,ar.size()-1);
    }
    Node solve(ArrayList<Integer> ar,int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        int mid=(s+e)/2;
        Node root=new Node(ar.get(mid));
        if(s==e)
        {
            return root;
        }
        root.left=solve(ar,s,mid-1);
        root.right=solve(ar,mid+1,e);
        return root;
    }
    void transform(Node root)
    {
        if(root==null)
        {
            return;
        }
        ar.add(root.data);
        transform(root.left);
        transform(root.right);
    }
}
 