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
            int e=sc.nextInt();
            int f=sc.nextInt();
            long dp[][]=new long[e+1][f+1];
            for(int i=0;i<=e;i++)
            {
                for(int j=0;j<=f;j++)
                {
                    dp[i][j]=-1;
                }
            }
            System.out.println(solve(e,f,dp));
        }
	 }
	 public static long solve(int e,int f,long dp[][])
	 {
	     if(f==0||f==1)
	     {
	         return f;
	     }
	     
	     if(e==1)
	     {
	         return f;
	     }
	     
	     if(dp[e][f]!=-1)
	     {
	         return dp[e][f];
	     }
	     long min=Integer.MAX_VALUE;
	     for(int k=1;k<=f;k++)
	     {
	         long left=-1;
	         long right=-1;
	         if(dp[e-1][k-1]!=-1)
	         {
	             left=dp[e-1][k-1];
	         }
	         else
	         {
	             left=solve(e-1,k-1,dp);
	         }
	         if(dp[e][f-k]!=-1)
	         {
	             right=dp[e][f-k];
	         }
	         else
	         {
	             right=solve(e,f-k,dp);
	         }
	         long temp=Math.max(left,right)+1;
	         min=Math.min(temp,min);
	     }
	     dp[e][f]=min;
	     return min;
	 }
}