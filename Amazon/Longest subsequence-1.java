
class Solution{
    static int longestSubsequence(int N, int ar[])
    {
        int dp[]=new int[N];
        int max=1;
        dp[0]=1;
        for(int i=1;i<N;i++)
        {
            dp[i]=1;
            for(int j=0;j<i;j++)
            {
                if(ar[i]==ar[j]+1||ar[i]==ar[j]-1)
                {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
}