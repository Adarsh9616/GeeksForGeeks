
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class gfg
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
            Node head=list.head;
            if(head.next==head)
            {
                return;
            }
            Node slow=list.head;
            Node fast=list.head;
            while(fast.next!=head&&fast.next.next!=head)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            if(fast.next.next==head)
            {
                fast=fast.next;
            }
            Node secondHead=slow.next;
            slow.next=null;
            fast.next=secondHead;
            slow.next=head;
            list.head1=head;
            list.head2=secondHead;
            
	 }
}