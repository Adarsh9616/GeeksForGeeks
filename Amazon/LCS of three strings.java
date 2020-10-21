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
            int o=sc.nextInt();
            String X=sc.next();
            String Y=sc.next();
            String Z=sc.next();
            int[][][] L = new int[m+1][n+1][o+1]; 
       
            for (int i=0; i<=m; i++) 
            { 
                for (int j=0; j<=n; j++) 
                { 
                    for (int k=0; k<=o; k++) 
                    { 
                        if (i == 0 || j == 0||k==0) 
                            L[i][j][k] = 0; 
           
                        else if (X.charAt(i - 1) == Y.charAt(j - 1) && X.charAt(i - 1)==Z.charAt(k - 1)) 
                                    L[i][j][k] = L[i-1][j-1][k-1] + 1; 
           
                        else
                            L[i][j][k] = Math.max(Math.max(L[i-1][j][k], L[i][j-1][k]),L[i][j][k-1]); 
                    } 
                } 
            } 
            System.out.println(L[m][n][o]); 
        }
	 }
}