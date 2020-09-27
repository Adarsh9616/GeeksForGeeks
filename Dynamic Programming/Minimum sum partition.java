class Solution
{

	public int minDiffernce(int arr[], int n) 
	{ 
	    int range=0;
	    for(int i:arr)
	    {
	        range+=i;
	    }
	    boolean dp[][]=new boolean[n+1][range+1];
	    dp[0][0]=true;
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=0;j<=range;j++)
	        {
	            if(arr[i-1]<=j)
	            {
	                dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
	            }
	            else
	            {
	                dp[i][j]=dp[i-1][j];
	            }
	        }
	    }
	    int min=Integer.MAX_VALUE;
	    for(int j=0;j<=range/2;j++)
	    {
	        if(dp[n][j]==true)
	        {
	            min=Math.min(min,range-(2*j));
	        }
	    }
	    return min;
	} 
}
