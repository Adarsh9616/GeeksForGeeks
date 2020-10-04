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
	        Integer a=null;
	        int ar[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            ar[i]=sc.nextInt();
	        }
	        int count=0;
	        for(int i:ar)
	        {
	            if(count==0)
	            {
	                a=i;
	                count++;
	            }
	            else if(i==a)
	            {
	                count++;
	            }
	            else
	            {
	                count--;
	            }
	        }
	        count=0;
	        for(int i:ar)
	        {
	            if(i==a)
	            {
	                count++;
	            }
	        }
	        if(count>n/2)
	        {
	            System.out.println(a);
	        }
	        else
	        {
	            System.out.println(-1);
	        }
	    }
	}
}