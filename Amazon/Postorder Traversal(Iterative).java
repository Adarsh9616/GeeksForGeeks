
//User function Template for Java



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
    ArrayList<Integer> postOrder(Node root)
    {
       ArrayList<Integer> ans=new ArrayList<>();
       solve(root,ans);
       return ans;
    }
    void solve(Node root,ArrayList<Integer> ans)
    {
        Stack<Node> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
            Node curr=s.pop();
            ans.add(curr.data);
            if(curr.left!=null)
            {
                s.push(curr.left);
            }
            if(curr.right!=null)
            {
                s.push(curr.right);
            }
        }
        Collections.reverse(ans);
    }
}
