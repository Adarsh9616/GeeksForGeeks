/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int ar[]=new int[n];
		    HashMap<Integer,Integer> m=new HashMap<>();
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.nextInt();
		        m.put(ar[i],1);
		    }
		    int ans=0;
		    for(int i=0;i<n-1;i++)
		    {
		        for(int j=i+1;j<n;j++)
		        {
		            if(m.containsKey(ar[i]+ar[j]))
		            {
		                ans++;
		            }
		        }
		    }
		    if(ans!=0)
		    System.out.println(ans);
		    else
		    System.out.println(-1);
		}
	}
}