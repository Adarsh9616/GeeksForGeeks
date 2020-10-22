/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Sol
{
    public static Node reverse(Node head)
    {
        if(head==null)
        {
            return null;
        }
        Node prev=null;
        Node cur=head;
        Node next=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public static Node addOne(Node head) 
    { 
        if(head==null)
        {
            return new Node(1);
        }
        Node rev=reverse(head);
        Node cur=rev;
        int carry=1;
        while(carry!=0&&cur!=null)
        {
            int newData=cur.data+carry;
            cur.data=newData%10;
            carry=newData/10;
            cur=cur.next;
        }
        Node n=reverse(rev);
        if(carry!=0)
        {
            Node temp=new Node(carry);
            temp.next=n;
            return temp;
        }
        return n;
    }
}
