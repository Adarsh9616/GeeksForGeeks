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
	        int N=sc.nextInt();
	        int X=sc.nextInt();
	        int ar[]=new int[N];
	        HashMap<Integer,Integer> m=new HashMap<>();
	        for(int i=0;i<N;i++)
	        {
	            ar[i]=sc.nextInt();
	        }
	        m.put(ar[0],1);
	        for(int i=1;i<N;i++)
	        {
	            ar[i]+=ar[i-1];
	            m.put(ar[i],i+1);
	        }
	        boolean aa=true;
	        for(int i=0;i<N;i++)
	        {
	            if(ar[i]-X==0)
	            {
	                aa=false;
	                System.out.println(1+" "+m.get(ar[i]));
	                break;
	            }
	            else if(m.containsKey(ar[i]-X))
	            {
	                aa=false;
	                System.out.println((m.get(ar[i]-X)+1)+" "+m.get(ar[i]));
	                break;
	            }
	        }
	        if(aa)
	        {
	            System.out.println(-1);
	        }
	        
	    }
	}
}