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
            int k=sc.nextInt();
            LinkedList<Integer> Di = new LinkedList<>(); 
            int i; 
            for (i = 0; i < k; i++) 
                if (arr[i] < 0) 
                    Di.add(i); 
              
            for ( ; i < n; i++) 
            { 
                if (!Di.isEmpty()) 
                    System.out.print(arr[Di.peek()] + " "); 
                  
                else
                    System.out.print("0" + " "); 
          
                while ((!Di.isEmpty()) &&  
                         Di.peek() < (i - k + 1)) 
                    Di.remove(); 
          
                if (arr[i] < 0) 
                    Di.add(i); 
            } 
            if (!Di.isEmpty()) 
                System.out.println(arr[Di.peek()] + " "); 
            else
                System.out.println("0" + " "); 
        }
	 }
}