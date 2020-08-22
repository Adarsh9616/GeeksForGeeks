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
	        int ar[]=new int[n+1];
	        for(int i=1;i<=n;i++)
	        {
	            int a=sc.nextInt();
	            if(a>=0&&a<=n)
	            {
	                ar[a]=-1;
	            }
	        }
	        
	        int i=0;
	        for(i=1;i<=n;i++)
	        {
	            if(ar[i]>=0)
	            {
	                break;
	            }
	        }
	        
	           System.out.println(i);
	        
	    }
	}
}