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
}
*/

class GfG
{
    boolean check(Node root)
    {
        if(root==null)
        {
            return true;
        }
        if(root.left==null&&root.right==null)
        {
            return true;
        }
        int levelCurrent=0;
        int levelCheck=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node temp=q.poll();
                if(temp.left==null&&temp.right==null)
                {
                    if(levelCheck!=0&&levelCheck!=levelCurrent)
                    {
                        return false;
                    }
                    levelCheck=levelCurrent;
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
            levelCurrent++;
        }
        return true;
    }
}