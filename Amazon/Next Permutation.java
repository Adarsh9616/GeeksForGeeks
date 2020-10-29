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
            int i=n-2;
            while(i>=0&&ar[i]>ar[i+1])
            {
                i--;
            }
            int j=n-1;
            while(j>=0&&ar[i]>=ar[j])
            {
                j--;
            }
            //System.out.println(ar[i]+"  "+ar[j]);
            swap(ar,i,j);
            //System.out.println(ar[i]+"  "+ar[j]);
            reverse(ar,i+1,n-1);
            for(int k=0;k<n;k++)
            {
                System.out.print(ar[k]+" ");
            }
            System.out.println();
        }
	 }
	 public static void swap(int ar[],int i,int j)
	 {
	     int temp=ar[i];
	     ar[i]=ar[j];
	     ar[j]=temp;
	 }
	 public static void reverse(int ar[],int i,int j)
	 {
	     while(i<j)
	     {
	         swap(ar,i,j);
	         i++;
	         j--;
	     }
	 }
}