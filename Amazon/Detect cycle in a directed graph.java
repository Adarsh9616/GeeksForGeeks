
/*Complete the function below*/

/*
ArrayList<ArrayList<Integer>> adj: to represent graph containing 'v'
                                    vertices and edges between them
V: represent number of vertices
*/
class DetectCycle
{
    ArrayList<ArrayList<Integer>> adj;
    int V;
    boolean isCyclic(ArrayList<ArrayList<Integer>> ad, int v)
    {
        adj=ad;
        V=v;
        boolean visited[]=new boolean[V];
        boolean helper[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                boolean ans=dfs(i,visited,helper);
                if(ans)
                {
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfs(int src,boolean visited[],boolean helper[])
    {
        if(visited[src])
        {
            return false;
        }
        visited[src]=true;
        helper[src]=true;
        for(int child:adj.get(src))
        {
            if(!visited[child])
            {
                boolean check=dfs(child,visited,helper);
                if(check)
                {
                    return true;
                }
            }
            if(helper[child])
            {
                return true;
            }
        }
        helper[src]=false;
        return false;
    }
}