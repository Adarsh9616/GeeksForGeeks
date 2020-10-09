class GfG
{
    int countPS(String str)
    {
        int n=str.length();
        int dp[][]=new int[n][n];
        for(int g=0;g<n;g++)
        {
            for(int i=0,j=g;j<n;j++,i++)
            {
                if(g==0)
                {
                    dp[i][j]=1;
                }
                else if(g==1)
                {
                    dp[i][j]=str.charAt(i)==str.charAt(j)?3:2;
                }
                else
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        dp[i][j]=dp[i+1][j]+dp[i][j-1]+1;
                    }
                    else
                    {
                        dp[i][j]=dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1];
                    }
                }
            }
        }
        return dp[0][n-1];
    }
}