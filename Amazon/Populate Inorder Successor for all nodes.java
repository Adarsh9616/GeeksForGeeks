
//User function Template for Java


/*class Node
    {
        int data;
        Node left,right,next;
        Node(int d) {data = d; left =right= next= null; }
    }*/

class GFG
{
     Node next=null;
    public void populateNext(Node root)
    {
        if(root==null)
        {
            return;
        }
        populateNext(root.right);
        root.next=next;
        next=root;
        populateNext(root.left);
    }

}