
/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class LinkedList
{
    static Node segregate(Node head)
    {
        // add your code here
        Node cur=head;
        int count0=0;
        int count1=0;
        int count2=0;
        while(cur!=null)
        {
            if(cur.data==0)
            {
                count0++;
            }
            else if(cur.data==1)
            {
                count1++;
            }
            else
            {
                count2++;
            }
            cur=cur.next;
        }
        cur=head;
            while(count0>0)
            {
                cur.data=0;
                cur=cur.next;
                count0--;
            }
            while(count1>0)
            {
                cur.data=1;
                cur=cur.next;
                count1--;
            }
            while(count2>0)
            {
                cur.data=2;
                cur=cur.next;
                count2--;
            }
        return head;
    }
}


