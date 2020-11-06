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
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int dp[]=new int[n+1];
            for(int i=0;i<=n;i++)
            {
                dp[i]=-1;
            }
            dp[0]=0;
            for(int i=0;i<=n;i++)
            {
                if(i+x<=n&&dp[i]!=-1)
                {
                    dp[i+x]=Math.max(dp[i+x],1+dp[i]);
                }
                if(i+y<=n&&dp[i]!=-1)
                {
                    dp[i+y]=Math.max(dp[i+y],1+dp[i]);
                }
                if(i+z<=n&&dp[i]!=-1)
                {
                    dp[i+z]=Math.max(dp[i+z],1+dp[i]);
                }
            }
            System.out.println(dp[n]);
        }
	 }
}