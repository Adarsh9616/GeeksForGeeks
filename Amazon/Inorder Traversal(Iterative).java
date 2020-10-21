//User function Template for Java



/* A Binary Tree node 

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
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
        Stack<Node> s=new Stack<>();
        Node curr=root;
        while(!s.isEmpty()||curr!=null)
        {
            if(curr!=null)
            {
                s.push(curr);
                curr=curr.left;
            }
            else
            {
                curr=s.pop();
                ans.add(curr.data);
                curr=curr.right;
            }
        }
    }
    
    
}