
// User function Template for Java

class Islands {

    // Function to find the number of island in the given list A
    // N, M: size of list row and column respectively
    ArrayList<ArrayList<Integer>> A;
    int n;
    int m;
    int findIslands(ArrayList<ArrayList<Integer>> a, int N, int M) 
    {
        int count=0;
        n=N;
        m=M;
        A=a;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(A.get(i).get(j)==1)
                {
                    count++;
                    solve(i,j);
                }
            }
        }
        return count;
    }
    void solve(int x,int y)
    {
        if(x<0||x>=n||y<0||y>=m||A.get(x).get(y)!=1)
        {
            return;
        }
        A.get(x).set(y,2);
        solve(x+1,y);
        solve(x-1,y);
        solve(x+1,y+1);
        solve(x+1,y-1);
        solve(x-1,y+1);
        solve(x-1,y-1);
        solve(x,y-1);
        solve(x,y+1);
    }
}
