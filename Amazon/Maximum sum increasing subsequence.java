
class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    long dp[]=new long[n];
	    dp[0]=arr[0];
	    long max=arr[0];
	    for(int i=1;i<n;i++)
	    {
	        dp[i]=arr[i];
	        for(int j=0;j<i;j++)
	        {
	            if(arr[i]>arr[j]&&arr[i]+dp[j]>=dp[i])
	            {
	                dp[i]=arr[i]+dp[j];
	            }
	        }
	        max=Math.max(dp[i],max);
	    }
	    return (int)max;
	}  
}