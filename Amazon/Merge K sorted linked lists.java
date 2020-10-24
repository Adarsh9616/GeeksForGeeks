
/*class Node
{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

// a is an array of Nodes of the heads of linked lists
// and N is size of array a


class Merge implements Comparator<Node>
{
    public int compare(Node a,Node b)
    {
        return a.data-b.data;
    }
    Node mergeKList(Node[]a,int N)
    {
        //Add your code here.
        PriorityQueue<Node> p=new PriorityQueue<>(new Merge());
        for(Node i:a)
        {
            if(i!=null)
                p.add(i);
        }
        Node ans=new Node(0);
        Node cur=ans;
        while(!p.isEmpty())
        {
            Node temp=p.poll();
            cur.next=temp;
            cur=cur.next;
            if(temp.next!=null)
                p.add(temp.next);
        }
        return ans.next;
    }
}
