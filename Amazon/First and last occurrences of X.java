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
            int target=sc.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            int l=0;
            int u=n-1;
            int k=-1;
            while(l<=u)
            {
                int mid=(l+u)/2;
                if(ar[mid]==target)
                {
                    k=mid;
                    break;
                }
                else if(ar[mid]<target)
                {
                    l=mid+1;
                }
                else
                {
                    u=mid-1;
                }
            }
            if(k==-1)
            {
                System.out.println(-1);
            }
            else
            {
                int i=k;
                int j=k;
                while(i>=0&&ar[i]==target)
                {
                    i--;
                }
                while(j<n&&ar[j]==target)
                {
                    j++;
                }
                System.out.println((i+1)+" "+(j-1));
            }
        }
	 }
}