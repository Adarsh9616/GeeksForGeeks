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
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        int z=sc.nextInt();
	        HashMap<Integer,Integer> m1=new HashMap<>();
	        HashMap<Integer,Integer> m2=new HashMap<>();
	        for(int i=0;i<x;i++)
	        {
	            int a=sc.nextInt();
	            m1.put(a,m1.getOrDefault(a,0)+1);
	        }
	        for(int i=0;i<y;i++)
	        {
	            int a=sc.nextInt();
	            m2.put(a,m2.getOrDefault(a,0)+1);
	        }
	        int count=-1;
	        for(int i=0;i<z;i++)
	        {
	            int a=sc.nextInt();
	            if(m1.containsKey(a)&&m2.containsKey(a)&&m1.get(a)>0&&m2.get(a)>0)
	            { 
	                count++;
	                int g=m1.get(a);
	                int h=m2.get(a);
	                m1.put(a,0);
	                m2.put(a,0);
	                System.out.print(a+" ");
	                
	            }
	        }
	        if(count==-1)
	        {
	            System.out.println(-1);
	        }
	        else
	        {
	            System.out.println();
	        }
	    }
	}
}