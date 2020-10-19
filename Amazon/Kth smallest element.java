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
            PriorityQueue<Integer> p=new PriorityQueue<>();
            for(int i=0;i<n;i++)
            {
                p.add(sc.nextInt());
            }
            int k=sc.nextInt();
            int ans=-1;
            while(k>0)
            {
                ans=p.poll();k--;
            }
            System.out.println(ans);
        }
	 }
}