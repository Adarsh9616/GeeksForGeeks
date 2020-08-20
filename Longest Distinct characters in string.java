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
	        Set<Character> set=new HashSet<>();
	        int ar[]=new int[256];
	        int l=0;
	        int ans=0;
	        int j=-1;
	        for(int i=0;i<s.length();i++)
	        {
	            if(!set.contains(s.charAt(i)))
	            {
	                set.add(s.charAt(i));
	                l++;
	                ar[s.charAt(i)]=i;
	            }
	            else
	            {
	                set.clear();
	                l=0;
	                i=ar[s.charAt(i)];
	            }
	            ans=Math.max(ans,l);
	        }
	        System.out.println(ans);
	    }
	}
}