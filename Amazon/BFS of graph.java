class Traversal {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) 
    {
        // add your code here
        ArrayList<Integer> ans=new ArrayList<>();
        boolean vis[]=new boolean[N];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty())
        {
            int temp=q.poll();
            if(!vis[temp])
                ans.add(temp);
            vis[temp]=true;
            ArrayList<Integer> t=g.get(temp);
            for(int te:t)
            {
                if(!vis[te])
                {
                    q.add(te);
                }
            }
        }
        return ans;
    }
}
