
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node ans=new Node(0);
        Node cur=ans;
        while(head1!=null&&head2!=null)
        {
            if(head1.data==head2.data)
            {
                cur.next=head1;
                head1=head1.next;
                head2=head2.next;
                cur.next.next=null;
                cur=cur.next;
            }
            else if(head1.data>head2.data)
            {
                head2=head2.next;
            }
            else
            {
                head1=head1.next;
            }
        }
        return ans.next;
    }
}