
/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    // head: head node
    Node removeDuplicates(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Node curr=root;
        while(curr!=null)
        {
            while(curr.next!=null && curr.next.data==curr.data)
            {
                curr.next=curr.next.next;
            }
            curr=curr.next;
        }
        return root;
    }
}
