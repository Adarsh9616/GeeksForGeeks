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
            int n = sc.nextInt();
            HashMap<String ,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                String s=sc.next();
                map.put(s,map.getOrDefault(s,0)+1);
            }
            int max=-1;
            int max2=-1;
            String s2="";
            String s1="";
            for(String s:map.keySet())
            {
                if(max<map.get(s))
                {
                    max2=max;
                    s2=s1;
                    max=map.get(s);
                    s1=s;
                }
                if(max2<map.get(s)&&map.get(s)<max)
                {
                    max2=map.get(s);
                    s2=s;
                }
            }
            System.out.println(s2);
        }
        
	 }
}