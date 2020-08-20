/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    public static boolean isPalin(char a,char b)
    {
        if(a==b)
        {
            return true;
        }
        return false;
    }
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        String s=sc.next();
	        String ans="";
	        int length=0;
	        for(int i=0;i<s.length();i++)
	        {
	            int l=i;
	            int r=i;
	            while(l>=0&&r<s.length()&&isPalin(s.charAt(l),s.charAt(r)))
	            {
	                l--;
	                r++;
	            }
	            if(r-l>length)
	            {
	                length=r-l;
	                ans=s.substring(l+1,r);
	            }
	            if(r-l==s.length())
	            {
	                break;
	            }
	            l=i;
	            r=i+1;
	            while(l>=0&&r<s.length()&&isPalin(s.charAt(l),s.charAt(r)))
	            {
	                l--;
	                r++;
	            }
	            if(r-l>length)
	            {
	                length=r-l;
	                ans=s.substring(l+1,r);
	            }
	            if(r-l==s.length())
	            {
	                break;
	            }
	        }
	        System.out.println(ans);
	        
	    }
	}
}