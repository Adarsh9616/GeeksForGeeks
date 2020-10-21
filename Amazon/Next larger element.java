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
            long ar[]=new long[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextLong();
            }
            Stack<Integer> s=new Stack<>();
            long ans[]=new long[n];
            for(int i=0;i<n;i++)
            {
                while(!s.isEmpty()&&ar[s.peek()]<ar[i])
                {
                    ans[s.pop()]=ar[i];
                }
                s.push(i);
            }
            while(!s.isEmpty())
            {
                ans[s.pop()]=-1;
            }
            for(long i:ans)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
	 }
}