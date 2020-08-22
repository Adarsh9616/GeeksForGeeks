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
	        sc.nextLine();
	        String s=sc.nextLine();
	        String ss[]=s.split(" ");
	        String max=ss[0];
	        String min=ss[0];
	        String ans="";
	        for(String a:ss)
	        {
	            if(a.compareTo(max)>=0)
	            {
	                max=a;
	            }
	            if(a.compareTo(min)<=0)
	            {
	                min=a;
	            }
	        }
	        for(int i=0;i<Math.min(min.length(),max.length());i++)
	        {
	            if(min.charAt(i)==max.charAt(i))
	            {
	                ans=ans+min.charAt(i);
	            }
	            else
	            {
	                break;
	            }
	        }
	        if(ans.length()==0)
	        {
	            System.out.println(-1);
	        }
	        else
	        {
	            System.out.println(ans);
	        }
	    }
	}
}