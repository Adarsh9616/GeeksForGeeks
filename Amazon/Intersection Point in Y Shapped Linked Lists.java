
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */
class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
	    int c1=count(headA);
	    int c2=count(headB);
	    if(c1>c2)
	    {
	        return getIntersection(c1-c2,headA,headB);
	    }
	    else
	    {
	        return getIntersection(c2-c1,headB,headA);
	    }
	    //return -1;
	}
	int getIntersection(int d,Node headA,Node headB)
	{
	    for(int i=0;i<d;i++)
	    {
	        if(headA==null)
	        {
	            return -1;
	        }
	        headA=headA.next;
	    }
	    while(headA!=null&&headB!=null)
	    {
	        if(headA==headB)
	        {
	            return headA.data;
	        }
	        headA=headA.next;
	        headB=headB.next;
	    }
	    return -1;
	}
	int count(Node head)
	{
	    if(head==null)
	    {
	        return 0;
	        
	    }
	    int k=0;
	    while(head!=null)
	    {
	        head=head.next;
	        k++;
	    }
	    return k;
	}
}


