//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class LinkedList
{
    static Node mergeSort(Node head)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        Node prev=head;
        Node slow=head.next;
        Node fast=head.next.next;
        while(fast!=null&&fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        Node left=mergeSort(head);
        Node right=mergeSort(slow);
        Node temp=merge(left,right);
        return temp;
    }
    static Node merge(Node A,Node B)
    {
        if(A==null)
        {
            return B;
        }
        if(B==null)
        {
            return A;
        }
        if(A.data<B.data)
        {
            A.next=merge(A.next,B);
            return A;
        }
        else
        {
            B.next=merge(A,B.next);
            return B;
        }
    }
}


