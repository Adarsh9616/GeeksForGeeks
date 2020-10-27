
/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class GfG
{
    Node compute(Node head)
    {
        // your code here
        if(head==null)
        {
            return null;
        }
        Node curr=head;
        Stack<Integer> s=new Stack<>();
        while(curr!=null)
        {
            while(!s.isEmpty()&&s.peek()<curr.data)
            {
                s.pop();
            }
            s.push(curr.data);
            curr=curr.next;
        }
        Node ans=new Node(0);
        Node next=null;
        while(!s.isEmpty())
        {
            next=ans.next;
            Node temp=new Node(s.pop());
            ans.next=temp;
            temp.next=next;
        }
        return ans.next;
    }
}
  