import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws IOException
	 {
        Scanner scan=new Scanner(System.in);
		int tc=scan.nextInt();
		int a[]=new int[tc];
		int max=0;
		for(int i=0;i<tc;i++)
		{
		    a[i]=scan.nextInt();
		    if(a[i]>max)
		        max=a[i];
		}
		
		  int n=max;
		  int t[]=new int[n+1];
		  t[1]=1;
		  if(n>1)
		    t[2]=2;
		  for(int i=3;i<=n;i++)
		        t[i]=(t[i-1]+t[i-2])%(1000000007);
		  for(int i=0;i<tc;i++)
		  System.out.println(t[a[i]]);
		
		
	 }
}