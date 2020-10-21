/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node temp=q.poll();
                ans.add(temp.data);
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}      