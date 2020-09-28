import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class GFG
 {
	public static void main (String[] args)
	 {
     	Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long k=2*n;
            //long res=1;
            BigInteger res=new BigInteger("1");
            for(long i=0;i<n;i++)
            {
                res=res.multiply(BigInteger.valueOf(k-i));
                //System.out.println(res);
                
                res=res.divide(BigInteger.valueOf(i+1));
                //System.out.println(res);
                
            }
            System.out.println(res.divide(BigInteger.valueOf(n+1)));
        }
	 }
}