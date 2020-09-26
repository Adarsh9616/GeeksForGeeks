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
            int N=sc.nextInt();
            int W=sc.nextInt();
            int val[]=new int[N];
            int wt[]=new int[N];
            for(int i=0;i<N;i++)
            {
                val[i]=sc.nextInt();
            }
            for(int i=0;i<N;i++)
            {
                wt[i]=sc.nextInt();
            }
            System.out.println(knapsack(wt,val,N,W));
        }
        
	 }
	 public static int knapsack(int wt[],int val[],int N,int W)
	 {
	     int dp[][]=new int[N+1][W+1];
	     for(int i=1;i<=N;i++)
	     {
	         for(int j=1;j<=W;j++)
	         {
	             if(wt[i-1]<=j)
	             {
	                 dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
	             }
	             else
	             {
	                 dp[i][j]=dp[i-1][j];
	             }
	         }
	     }
	     return dp[N][W];
	 }
}