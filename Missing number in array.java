/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        n=n-1;
	        int ar[]=new int[n+1];
	        for(int i=0;i<n;i++)
	        {
	            ar[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	            ar[Math.abs(ar[i])-1]=ar[Math.abs(ar[i])-1]*(-1);
	        }
	        int ans=n+1;
	        for(int i=0;i<n;i++)
	        {
	            if(ar[i]>0)
	            {
	                ans=i+1;
	                break;
	            }
	        }
	        System.out.println(ans);
	    }
	}
}