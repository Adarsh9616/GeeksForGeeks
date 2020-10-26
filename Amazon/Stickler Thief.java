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
            int dp[][]=new int[2][n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            dp[0][0]=ar[0];
            dp[1][0]=0;
            for(int i=1;i<n;i++)
            {
                dp[0][i]=ar[i]+dp[1][i-1];
                dp[1][i]=Math.max(dp[0][i-1],dp[1][i-1]);
            }
            System.out.println(Math.max(dp[0][n-1],dp[1][n-1]));
        }
	 }
}