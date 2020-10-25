//User function Template for Java

// class Node
// {
//     int data; //data of the node
//     int hd; //horizontal distance of the node
//     Node left, right; //left and right references
 
//     // Constructor of tree node
//     public Node(int key)
//     {
//         data = key;
//         hd = Integer.MAX_VALUE;
//         left = right = null;
//     }
// }


class Tree
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
    ArrayList<Integer> bottomView(Node root)
    {
        addToMap(root);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i:map.keySet())
        {
            ans.add(map.get(i).data);
        }
        //System.out.println();
        return ans;
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
                map.put(temp.d,temp.n);
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