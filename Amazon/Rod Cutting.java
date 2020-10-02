import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
     	Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int ar[]=new int[n];
            int length[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
                length[i]=i+1;
            }
            int dp[][]=new int[n+1][n+1];
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(length[i-1]<=j)
                    {
                        dp[i][j]=Math.max(ar[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
                    }
                    else
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
            System.out.println(dp[n][n]);
        }
	 }
}