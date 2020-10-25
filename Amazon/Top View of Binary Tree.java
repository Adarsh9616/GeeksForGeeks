
//User function Template for Java



/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class View
{
    class Pair
    {
        Node n;
        int d;
        Pair(Node root,int t)
        {
            n=root;
            d=t;
        }
    }
    Map<Integer,Node> map=new TreeMap<>();
    // function should print the topView of the binary tree
     void topView(Node root)
    {
        addToMap(root);
        for(int i:map.keySet())
        {
            System.out.print(map.get(i).data+" ");
        }
        //System.out.println();
    }
    void addToMap(Node root)
    {
        Queue<Pair> q=new LinkedList<>();
        Pair p=new Pair(root,0);
        q.add(p);
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Pair temp=q.poll();
                if(!map.containsKey(temp.d))
                {
                    map.put(temp.d,temp.n);
                }
                if(temp.n.left!=null)
                {
                    q.add(new Pair(temp.n.left,temp.d-1));
                }
                if(temp.n.right!=null)
                {
                    q.add(new Pair(temp.n.right,temp.d+1));
                }
            }
        }
    }
}