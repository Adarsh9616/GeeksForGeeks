class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        if(head.next==null)
        {
            return true;
        }
        Node slow=head;
        Node fast=head;
        Node prev=head;
        int count=0;
        while(fast!=null&&fast.next!=null)
        {
            count++;
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        Node nextPart;
        if(fast==null&&count==1)
        {
            nextPart=slow;
        }
        else if(count%2==0)
        {
            nextPart=slow;
        }
        else
        {
            nextPart=slow.next;
        }
        nextPart=reverse(nextPart);
        Node p=head;
        Node q=nextPart;
        while(p!=null&&q!=null)
        {
            if(p.data!=q.data)
            {
                
                return false;
            }
            
            p=p.next;
            q=q.next;
        }
        //System.out.println(p.data+"  "+q.data);
        if(p!=null||q!=null)
        {
            return false;
        }
        return true;
    }   
    Node reverse(Node head)
    {
        Node next=null;
        Node prev=null;
        Node current=head;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
