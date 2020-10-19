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
            int count=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=31;j>=0;j--)
                {
                    if(((i>>j)&1)==1)
                    {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
	 }
}