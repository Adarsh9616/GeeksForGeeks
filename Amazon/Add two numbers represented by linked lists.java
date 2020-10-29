
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution
{
    Node ans=new Node(0);
    int carry=0;
    Node addLists(Node first, Node second)
    {
        int a=count(first);
        int b=count(second);
        if(a==b)
            solve(first,second);
        else if(a>b)
        {
            int k=0;
            Node cur=first;
            while(k<a-b)
            {
                cur=cur.next;
                k++;
            }
            solve(cur,second);
            propagate(first,cur);
        }
        else
        {
            int k=0;
            Node cur=second;
            while(k<b-a)
            {
                cur=cur.next;
                k++;
            }
            solve(first,cur);
            propagate(second,cur);
        }
        if(carry!=0)
        {
            addToRemaining();
            
        }
        return ans.next;
            
    }
    void addToRemaining()
    {
            Node t=new Node(carry);
            Node prev=ans.next;
            ans.next=t;
            t.next=prev;
    }
    void propagate(Node a,Node curr)
    {
        if(a==curr)
        {
            return;
        }
        propagate(a.next,curr);
        int sum=a.data+carry;
        Node temp=new Node(sum%10);
        carry=sum/10;
        Node prev=ans.next;
        ans.next=temp;
        temp.next=prev;
        return;
    }
    void solve(Node first,Node second)
    {
        if(first==null||second==null)
        {
            return;
        }
        solve(first.next,second.next);
        int sum=first.data+second.data+carry;
        Node temp=new Node(sum%10);
        carry=sum/10;
        Node prev=ans.next;
        ans.next=temp;
        temp.next=prev;
        return;
    }
    int count(Node head)
    {
        if(head==null)
        {
            return 0;
        }
        Node cur=head;
        int c=0;
        while(cur!=null)
        {
            c++;
            cur=cur.next;
        }
        return c;
    }
}