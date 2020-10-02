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
            String A=sc.next();
            int n=A.length();
            StringBuilder s=new StringBuilder(A);
            String B=s.reverse().toString();
            int dp[][]=new int[n+1][n+1];
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(A.charAt(i-1)==B.charAt(j-1))
                    {
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else
                    {
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            System.out.println(dp[n][n]);
        }
	 }
}