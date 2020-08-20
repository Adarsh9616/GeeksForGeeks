/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int t =sc.nextInt();
	    while(t-->0)
	    {
	        String s=sc.next();
	        //System.out.println(s);
	        String ss=sc.next();
	        int ar[]=new int[26];
	        boolean ans=true;
	        if(s.length()!=ss.length())
	        {
	            ans=false;
	            
	        }
	        if(ans!=false)
	        for(int i=0;i<s.length();i++)
	        {
	            ar[s.charAt(i)-'a']++;
	            ar[ss.charAt(i)-'a']--;
	        }
	        for(int i:ar)
	        {
	            if(i!=0)
	            {
	                ans=false;
	                break;
	            }
	        }
	        if(ans!=false)
	        {
	            System.out.println("YES");
	        }
	        else
	        {
	            System.out.println("NO");
	        }
	    }
	}
}