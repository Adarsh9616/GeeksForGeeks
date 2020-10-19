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
            int count[]=new int[3];
            for(int i=0;i<n;i++)
            {
                count[sc.nextInt()]++;
            }
            int k=0;
            for(int i:count)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print(k+" ");
                }
                k++;
            }
            System.out.println();
        }
	 }
}