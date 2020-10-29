class GfG
{
    HashMap<Tree,Tree> map=new HashMap<>();
    public Tree cloneTree(Tree tree)
    {
        if(tree==null)
        {
            return null;
        }
        
        create(tree);
        connect(tree);
        return map.get(tree);
        
    }
    public void connect(Tree tree)
    {
        if(tree==null)
        {
            return;
        }
        Tree t=map.get(tree);
        t.left=map.get(tree.left);
        t.right=map.get(tree.right);
        t.random=map.get(tree.random);
        connect(tree.left);
        connect(tree.right);
    }
    public void create(Tree tree)
    {
        if(tree==null)
        {
            return;
        }
        map.put(tree,new Tree(tree.data));
        create(tree.left);
        create(tree.right);
    }
}