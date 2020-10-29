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
            String s=sc.next();
            s=s.toLowerCase();
            int ans=0;
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                if(!map.containsKey(s.charAt(i)))
                {
                    map.put(s.charAt(i),i);
                    ans=Math.max(ans,map.size());
                }
                else
                {
                    i=map.get(s.charAt(i))+1;
                    map.clear();
                    map.put(s.charAt(i),i);
                }
            }
            System.out.println(ans);
        }
	 }
}