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
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            long dp[][]=new long[2][n];
            long max=1;
            for(int j=0;j<n;j++)
            {
                dp[0][j]=1;
                dp[1][j]=1;
            }
            for(int i=1;i<n;i++)
            {
                for(int j=0;j<i;j++)
                {
                    if(ar[i]>ar[j]&&dp[0][i]<dp[1][j]+1)
                    {
                        dp[0][i]=dp[1][j]+1;
                    }
                    if(ar[i]<ar[j]&&dp[1][i]<dp[0][j]+1)
                    {
                        dp[1][i]=dp[0][j]+1;
                    }
                }
                if(max<Math.max(dp[0][i],dp[1][i]))
                {
                    max=Math.max(dp[0][i],dp[1][i]);
                }
            }
            System.out.println(max);
        }
	 }
}