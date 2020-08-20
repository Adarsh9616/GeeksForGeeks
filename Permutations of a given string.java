/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static String swap(String s,int l,int r)
    {
        char c[]=s.toCharArray();
        char t=c[l];
        c[l]=c[r];
        c[r]=t;
        return String.valueOf(c);
    }
    static List<String> list;
    public static void solve(String s,int l,int r)
    {
        if(l==r)
        {
            list.add(s);
            return;
        }
        for(int i=l;i<=r;i++)
        {
            s=swap(s,l,i);
            solve(s,l+1,r);
            s=swap(s,l,i);
        }
    }
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        String s=sc.next();
	        list=new ArrayList<>();
	        solve(s,0,s.length()-1);
	        Collections.sort(list);
	        for(String a:list)
	        {
	            System.out.print(a+" ");
	        }
	        System.out.println();
	        
	    }
	}
}