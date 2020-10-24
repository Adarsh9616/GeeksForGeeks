class GfG 
{
    ArrayList<String> ans=new ArrayList<>();
    public ArrayList<String> printPath(int[][] m, int n) 
    {
        // Your code here
        solve(m,n,0,0,"");
        Collections.sort(ans);
        return ans;
    }
    public void solve(int m[][],int n,int x,int y,String s)
    {
        if(x<0||x>=n||y<0||y>=n||m[x][y]!=1)
        {
            return;
        }
        if(x==n-1&&y==n-1)
        {
            ans.add(s);
            return;
        }
        m[x][y]=2;
        solve(m,n,x+1,y,s+'D');
        solve(m,n,x,y+1,s+'R');
        solve(m,n,x,y-1,s+'L');
        solve(m,n,x-1,y,s+'U');
        m[x][y]=1;
    }
}