/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
        if(head==null)
        {
            return true;
        }
        Node cur=head;
        while(cur!=null)
        {
            cur=cur.next;
            if(cur==head)
            {
                return true;
            }
        }
        return false;
    }
}