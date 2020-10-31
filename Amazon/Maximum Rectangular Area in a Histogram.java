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
            int nsr[]=new int[n];
            int nsl[]=new int[n];
            Stack<Integer> s=new Stack<>();
            for(int i=0;i<n;i++)
            {
                while(!s.isEmpty()&&ar[s.peek()]>=ar[i])
                {
                    s.pop();
                }
                if(s.isEmpty())
                {
                    nsl[i]=-1;
                }
                else
                {
                    nsl[i]=s.peek();
                }
                s.push(i);
            }
            s=new Stack<>();
            for(int i=n-1;i>=0;i--)
            {
                while(!s.isEmpty()&&ar[s.peek()]>=ar[i])
                {
                    s.pop();
                }
                if(s.isEmpty())
                {
                    nsr[i]=n;
                }
                else
                {
                    nsr[i]=s.peek();
                }
                s.push(i);
            }
            int max=-1;
            for(int i=0;i<n;i++)
            {
                int width=i-nsl[i];
                width+=nsr[i]-i;
                max=Math.max(max,(width-1)*ar[i]);
            }
            System.out.println(max);
            
        }
	 }
}