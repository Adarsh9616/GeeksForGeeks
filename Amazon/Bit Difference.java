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
            int count=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            for(int i=31;i>=0;i--)
            {
                if((((a>>i)&1)^((b>>i)&1))==1)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
	 }
}