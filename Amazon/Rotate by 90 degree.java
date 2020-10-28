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
            int ar[][]=new int[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    ar[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<n/2;i++)
            {
                for(int j=i;j<n-i-1;j++)
                {
                    int temp=ar[i][j];
                    ar[i][j]=ar[j][n-1-i];
                    ar[j][n-1-i]=ar[n-1-i][n-1-j];
                    ar[n-1-i][n-1-j]=ar[n-1-j][i];
                    ar[n-1-j][i]=temp;
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(ar[i][j]+" ");
                }
            }
            System.out.println();
        }
	 }
}