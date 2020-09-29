import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {// N log N time
	public static void main (String[] args)
	 {
     	Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int maxLength=0;
            int ar[]=new int[n];
            int dp[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            for(int i:ar)
            {
                int index=Arrays.binarySearch(dp,0,maxLength,i);
                if(index<0)
                {
                    index=Math.abs(index+1);
                }
                dp[index]=i;
                if(index==maxLength)
                {
                    maxLength++;
                }
            }
            System.out.println(maxLength);
        }
	 }
}