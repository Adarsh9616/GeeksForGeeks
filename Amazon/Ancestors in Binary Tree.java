class GfG
{
    
    public static ArrayList<Integer> Ancestors(Node node, int x)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        search(node,x,ans);
        return ans;
    }
    public static boolean search(Node node,int x,ArrayList<Integer> ans)
    {
        if(node==null)
        {
            return false;
        }
        if(node.data==x)
        {
            return true;
        }
        if(search(node.left,x,ans)||search(node.right,x,ans))
        {
            ans.add(node.data);
            return true;
            
        }
        return false;
    }
}