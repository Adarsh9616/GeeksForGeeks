
//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        solve(root,ans);
        return ans;
    }
    static void solve(Node root,ArrayList<Integer> ans)
    {
        Stack<Node> s=new Stack<>();
        Node curr=root;
        s.push(curr);
        while(!s.isEmpty())
        {
            curr=s.pop();
            ans.add(curr.data);
            if(curr.right!=null)
            {
                s.push(curr.right);
            }
            if(curr.left!=null)
            {
                s.push(curr.left);
            }
        }
    }

}