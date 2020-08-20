/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        String s=sc.nextLine();
	        int ar[]=new int[256];
	        String ans="";
	        for(char c:s.toCharArray())
	        {
	            if(ar[c]==0)
	            {
	                ans=ans+c;
	                ar[c]=1;
	            }
	        }
	        System.out.println(ans);
	    }
	}
}