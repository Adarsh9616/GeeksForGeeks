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
            int ar[][]=new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    ar[i][j]=sc.nextInt();
                }
            }
            
            int max=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(i>0&&i<n&&j>0&&j<m&&ar[i][j]==1)
                    {
                        ar[i][j]=Math.min(ar[i-1][j-1],Math.min(ar[i-1][j],ar[i][j-1]))+1;
                        max=Math.max(ar[i][j],max);
                    }
                    else
                    {
                        max=Math.max(ar[i][j],max);
                    }
                }
            }
            System.out.println(max);
        }
	 }
}