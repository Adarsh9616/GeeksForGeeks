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
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            boolean check=false;
            int maxJump=ar[0];
            int count=0;
            int tempJump=0;
            for(int i=0;i<n;i++)
            {
                if(maxJump>=n-1)
                {
                    check=true;
                    count++;
                    break;
                }
                if(i<=maxJump)
                {
                    tempJump=Math.max(tempJump,i+ar[i]);
                }
                if(i==maxJump)
                {
                    maxJump=tempJump;
                    count++;
                }
            }
            if(check)
            {
                System.out.println(count);
            }
            else
            {
                System.out.println(-1);
            }
        }
	 }
}