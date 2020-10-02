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
            String dict[]=new String[n];
            for(int i=0;i<n;i++)
            {
                dict[i]=sc.next();
            }
            String s=sc.next();
            boolean dp[]=new boolean[s.length()+1];
            dp[0]=true;
            for(int i=1;i<=s.length();i++)
            {
                boolean check=false;
                String temp=s.substring(0,i);
                for(String a:dict)
                {
                    if(temp.endsWith(a)&&dp[i-a.length()])
                    {
                        check=true;
                    }
                }
                dp[i]=check;
            }
            System.out.println(dp[s.length()]?1:0);
        }
	 }
}