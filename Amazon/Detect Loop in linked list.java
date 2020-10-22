
/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    public static boolean detectLoop(Node head)
    {
        if(head==null||head.next==null)
        {
            return false;
        }
        Node slow=head.next;
        Node fast=head.next.next;
        while(fast!=null&&fast.next!=null)
        {
            if(slow==fast)
            {
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return false;
        
    }
}