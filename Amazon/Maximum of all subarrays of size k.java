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
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Deque<Integer> Qi = new LinkedList<Integer>();
            int i;
            for (i = 0; i < k; ++i) 
            {
                while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                    Qi.removeLast(); 
     
                Qi.addLast(i);
            }
     
            for (; i < n; ++i) 
            {
             
                System.out.print(arr[Qi.peek()] + " ");
     
                while ((!Qi.isEmpty()) && Qi.peek() <= i - k)
                    Qi.removeFirst();
     
                while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
                    Qi.removeLast();
                Qi.addLast(i);
            }
            System.out.println(arr[Qi.peek()]);
        }
	 }
}