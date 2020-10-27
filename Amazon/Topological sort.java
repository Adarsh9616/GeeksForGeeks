class TopologicalSort 
{
    ArrayList<ArrayList<Integer>> adj;
    int N;
    int[] topoSort(ArrayList<ArrayList<Integer>> ad, int n) 
    {
        adj=ad;
        N=n;
        Stack<Integer> s=new Stack<>();
        boolean visited[]=new boolean[N];
        for(int i=0;i<N;i++)
        {
            if(!visited[i])
            {
                
                topo(i,s,visited);
            }
        }
        int ans[]=new int[N];
        int k=0;
        while(!s.isEmpty())
        {
            ans[k++]=s.pop();
        }
        //System.out.println(Arrays.toString(ans));
        return ans;
    }
    void topo(int src,Stack<Integer> s,boolean visited[])
    {
        visited[src]=true;
        for(int i:adj.get(src))
        {
            if(!visited[i])
            {
                topo(i,s,visited);
            }
        }
        s.push(src);
    }
    
}
