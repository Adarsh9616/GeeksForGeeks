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
            long n=sc.nextLong();
            if((n&(n-1))==0&&n!=0)
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