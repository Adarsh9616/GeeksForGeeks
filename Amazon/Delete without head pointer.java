class GfG
{
    void deleteNode(Node node)
    {
        Node prev=null;
        while(node.next!=null)
        {
            prev=node;
            node.data=node.next.data;
            node=node.next;
        }
        prev.next=null;
    }
}