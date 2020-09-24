class Tree
{
    void mirror(Node node)
    {
        if(node==null)
        {
            return;
        }
        Node temp= node.left;
        node.left=node.right;
        node.right=temp;
        mirror(node.left);
        mirror(node.right);
    }
}