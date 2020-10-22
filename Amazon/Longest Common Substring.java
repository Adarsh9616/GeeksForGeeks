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
            int m=sc.nextInt();
            String A=sc.next();
            String B=sc.next();
            int dp[][]=new int[n+1][m+1];
            int max=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=m;j++)
                {
                    if(A.charAt(i-1)==B.charAt(j-1))
                    {
                        dp[i][j]=dp[i-1][j-1]+1;
                        max=Math.max(dp[i][j],max);
                    }
                    else
                    {
                        dp[i][j]=0;
                    }
                }
            }
            System.out.println(max);
        }
	 }
}