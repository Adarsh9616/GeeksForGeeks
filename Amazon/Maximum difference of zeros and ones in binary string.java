
class Solution {
    int maxSubstring(String S) 
    {
        
        int dp[]=new int[S.length()];
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='1')
            {
                dp[i]=-1;
            }
            else
            {
                dp[i]=1;
            }
        }
        int m=dp[0];
        int max=dp[0];
        for(int i=1;i<S.length();i++)
        {
            m=Math.max(dp[i],m+dp[i]);
            max=Math.max(m,max);
        }
        return max;
    }
}