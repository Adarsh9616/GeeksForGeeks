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
            int dp[]=new int[n+1];
            dp[0]=1;
            int i;
            for (i = 3; i <= n; i++) 
                dp[i] += dp[i - 3]; 
            for (i = 5; i <= n; i++) 
                dp[i] += dp[i - 5]; 
            for (i = 10; i <= n; i++) 
                dp[i] += dp[i - 10]; 
          
            System.out.println(dp[n]);
        }
	 }
}