

class Solution
{
	public int minimumCost(int cost[], int N,int W)
	{
	    
	    ArrayList<Integer> nCost=new ArrayList<>();
	    ArrayList<Integer> weight=new ArrayList<>();
	    int size=0;
	    for(int i=0;i<N;i++)
	    {
	        if(cost[i]!=-1)
	        {
	            nCost.add(cost[i]);
	            weight.add(i+1);
	            size++;
	        }
	    }
	    N=size;
	    long dp[][]=new long[N+1][W+1];
	    for(int i=0;i<=W;i++)
	    {
	        dp[0][i]=Integer.MAX_VALUE;
	    }
	    for(int i=1;i<=N;i++)
	    {
	        for(int j=1;j<=W;j++)
	        {
	            if(weight.get(i-1)<=j)
	            {
	                dp[i][j]=Math.min(nCost.get(i-1)+dp[i][j-weight.get(i-1)],dp[i-1][j]);
	            }
	            else
	            {
	                dp[i][j]=dp[i-1][j];
	            }
	        }
	    }
	    return (dp[N][W]>=Integer.MAX_VALUE)?-1:(int)dp[N][W];
	}
}