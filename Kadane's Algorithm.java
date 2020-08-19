/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            while(t-- > 0)
            {
                int n = Integer.parseInt(br.readLine());
                int ar[] = new int[n];
                
                String line = br.readLine();
                int i = 0;
                for (String numStr: line.split("\\s"))
                {
                    ar[i] = Integer.parseInt(numStr);
                    i++;
                }
    	        int max=ar[0];
    	        int ans=ar[0];
    	        for(int j=1;j<n;j++)
    	        {
    	            max=Math.max(max+ar[j],ar[j]);
    	            ans=Math.max(max,ans);
    	        }
    	        System.out.print(ans+"\n");
	        }
	}
}