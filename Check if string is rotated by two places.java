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
	        String a=sc.next();
	        String b=sc.next();
	        String temp=a.substring(2)+a.substring(0,2);
	        String temp1=a.substring(a.length()-2)+a.substring(0,a.length()-2);
	       // System.out.println(temp);
	       // System.out.println(temp1);
	        if(b.equals(temp)||b.equals(temp1))
	        {
	            System.out.println(1);
	        }
	        else
	        {
	            System.out.println(0);
	        }
	    }
	}
}