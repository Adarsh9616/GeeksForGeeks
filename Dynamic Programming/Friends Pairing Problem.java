class Solution
{
    public long countFriendsPairings(int n) 
    { 
        if(n<2)
        {
            return 1;
        }
        long dp[]=new long[n+1];
        long mod=1000000007;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=(dp[i-1]%mod+(i-1)*dp[i-2]%mod)%mod;
        }
        return dp[n]%mod;
    }
} 