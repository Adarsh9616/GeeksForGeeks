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
            int m=sc.nextInt();
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n+m;i++)
            {
                int k=sc.nextInt();
                set.add(k);
            }
            System.out.println(set.size());
        }
	 }
}