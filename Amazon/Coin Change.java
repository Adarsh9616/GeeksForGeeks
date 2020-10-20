class Solution
{
    public long count(int S[], int m, int n) 
    { 
        long dp[][]=new long[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(S[i-1]<=j)
                {
                    dp[i][j]=dp[i][j-S[i-1]]+dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[m][n];
    } 