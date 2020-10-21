
class Traversal
{
    ArrayList<Integer> ans=new ArrayList<>();
    boolean vis[];
    ArrayList<ArrayList<Integer>> adj;
    ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
        vis=new boolean[N];
        adj=g;
        dfs(0);
        return ans;
    }
    void dfs(int start)
    {
        if(vis[start])
        {
            return;
        }
        ans.add(start);
        vis[start]=true;
        ArrayList<Integer> temp=adj.get(start);
        for(int i:temp)
        {
            if(!vis[i])
            {
                dfs(i);
            }
        }
    }
}

