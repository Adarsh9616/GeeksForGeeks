
//User function Template for Java

/*
ArrayList<ArrayList<Integer>> g: represent graph containing 'V' number of
                                    vertices and edges between them
V: represent number of vertices
*/
class DetectCycle
{
    ArrayList<ArrayList<Integer>> adj;
    int V;
    boolean isCyclic(ArrayList<ArrayList<Integer>> g, int v)
    {
        adj=g;
        V=v;
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                boolean ans=dfs(i,-1,visited);
                if(ans)
                {
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfs(int src,int parent,boolean visited[])
    {
        if(visited[src])
        {
            return true;
        }
        visited[src]=true;
        for(int i:adj.get(src))
        {
            
            if(!visited[i])
            {
                boolean check=dfs(i,src,visited);
                if(check)
                {
                    return true;
                }
            }
            else if(i!=parent&&visited[i])
            {
                return true;
            }
            
        }
        return false;
    }
}