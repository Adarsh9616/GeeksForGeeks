
//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    ArrayList<Integer> rightView(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(root==null)
        {
            return ans;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                
                Node temp=q.poll();
                if(i==size-1)
                {
                    ans.add(temp.data);
                }
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
        }
        return ans;
    }
}