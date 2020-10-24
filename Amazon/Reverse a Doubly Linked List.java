/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
    Node cur=head;
    Node t=cur;
    while(cur!=null)
    {
        t=cur;
        Node temp=cur.prev;
        cur.prev=cur.next;
        cur.next=temp;
        cur=cur.prev;
    }
    return t;
    
}