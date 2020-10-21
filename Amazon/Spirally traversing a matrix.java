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
            int m=sc.nextInt();
            int n=sc.nextInt();
            int ar[][]=new int[m][n];
            int r1=0;
            int c1=0;
            int r2=m-1;
            int c2=n-1;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    ar[i][j]=sc.nextInt();
                }
            }
            int c=0;
            while(r1<=r2&&c1<=c2)
            {
                c=c%4;
                if(c==0)
                {
                    for(int i=c1;i<=c2;i++)
                    {
                        System.out.print(ar[r1][i]+" ");
                    }
                    r1++;
                    c++;
                }
                else if(c==1)
                {
                    for(int i=r1;i<=r2;i++)
                    {
                        System.out.print(ar[i][c2]+" ");
                    }
                    c2--;
                    c++;
                    
                }
                else if(c==2)
                {
                    for(int i=c2;i>=c1;i--)
                    {
                        System.out.print(ar[r2][i]+" ");
                    }
                    r2--;
                    c++;
                }
                else if(c==3)
                {
                    for(int i=r2;i>=r1;i--)
                    {
                        System.out.print(ar[i][c1]+" ");
                    }
                    c1++;
                    c++;
                }
            }
            System.out.println();
        }
	 }
}