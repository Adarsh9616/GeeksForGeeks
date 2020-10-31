
// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG 
{
    Node A;
    Node B;
    int a;
    int b;
    int findDist(Node root, int x, int y) 
    {
        a=x;
        b=y;
        HashMap<Node,Node> map=new HashMap<>();
        createMap(map,root);
        Queue<Node> q=new LinkedList<>();
        q.add(A);
        HashSet<Node> visited=new HashSet<>();
        int k=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node temp=q.poll();
                visited.add(temp);
                if(temp==B)
                {
                    return k;
                }
                if(map.containsKey(temp)&&!visited.contains(map.get(temp)))
                {
                    q.add(map.get(temp));
                }
                if(temp.left!=null&&!visited.contains(temp.left))
                {
                    q.add(temp.left);
                }
                if(temp.right!=null&&!visited.contains(temp.right))
                {
                    q.add(temp.right);
                }
            }
            k++;
        }
        return -1;
    }
    void createMap(HashMap<Node,Node> map,Node node)
    {
        if(node==null)
        {
            return ;
        }
        if(node.left!=null)
        {
            map.put(node.left,node);
        }
        if(node.right!=null)
        {
            map.put(node.right,node);
        }
        if(node.data==a)
        {
            A=node;
        }
        if(node.data==b)
        {
            B=node;
        }
        createMap(map,node.left);
        createMap(map,node.right);
    }
}