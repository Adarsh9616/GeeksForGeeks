
class Solution{
    static int maximumPath(int N, int m[][])
    {
        // code here
        int ans=-1;
        for(int i=0;i<N;i++)
        {
            ans=Math.max(ans,m[0][i]);
        }
        for(int i=1;i<N;i++)
        {
            ans=-1;
            for(int j=0;j<N;j++)
            {
                if(j>0&&j<N-1)
                {
                    m[i][j]=m[i][j]+Math.max(m[i-1][j],Math.max(m[i-1][j-1],m[i-1][j+1]));
                }
                else if(j==0)
                {
                    m[i][j]=m[i][j]+Math.max(m[i-1][j],m[i-1][j+1]);
                }
                else if(j==N-1)
                {
                    m[i][j]=m[i][j]+Math.max(m[i-1][j-1],m[i-1][j]);
                }
                ans=Math.max(m[i][j],ans);
            }
        }
        return (int)ans;
    }
}