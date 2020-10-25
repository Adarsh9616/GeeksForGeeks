//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/
// Print the zig zag traversal of tree.
class GFG
{
    // return an array containing the zig zag level order traversal of the given tree
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    if(root==null)
        {
            return new ArrayList<>();
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        ArrayList<Integer> ans=new ArrayList<>();
        int k=1;
        while(!q.isEmpty())
        {
            List<Integer> l=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node temp=q.poll();
                l.add(temp.data);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            if((k&1)==0)
            {
                Collections.reverse(l);
            }
            ans.addAll(l);
            k++;
        }
        return ans;
	}
}