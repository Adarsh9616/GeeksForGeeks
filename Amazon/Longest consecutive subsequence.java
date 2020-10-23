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
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
             HashSet<Integer> S = new HashSet<Integer>();
            int ans = 0;
            
            for (int i = 0; i < n; ++i)
                S.add(arr[i]);
     
            for (int i = 0; i < n; ++i) 
            {
                if (!S.contains(arr[i] - 1)) 
                {
                    int j = arr[i];
                    while (S.contains(j))
                        j++;
                        
                    if (ans < j - arr[i])
                        ans = j - arr[i];
                }
            }
            System.out.println(ans);
        }
	 }
}