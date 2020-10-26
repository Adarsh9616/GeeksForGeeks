

class Solution
{
    long countWays(int n,int k)
    {
        if(n==1)
        {
            return k;
        }
        
        long mod=1000000007;
        long same=k;
        long diff=k*(k-1);
        long total=same+diff;
        for(int i=3;i<=n;i++)
        {
            same=diff;
            diff=((total%mod)*((k-1)%mod))%mod;
            total=((same%mod)+(diff%mod))%mod;
        }
        return total%mod;
    }
}

