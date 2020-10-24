// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG
{
    Stack<Integer> min=new Stack<>();
	public void push(int a,Stack<Integer> s)
	{
	    s.push(a);
	    if(min.isEmpty())
	    {
	        min.push(a);
	    }
	    else
	    {
	        int x=min.peek();
	        int y=a;
	        if(x<y)
	        {
	            min.push(x);
	        }
	        else 
	        {
	            min.push(y);
	        }
	    }
	}
	public int pop(Stack<Integer> s)
    {
        min.pop();
            return s.pop();
            
	}
	public int min(Stack<Integer> s)
    {
        return min.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
    {
        
           return s.size()>=n;
	}
	public boolean isEmpty(Stack<Integer>s)
    {
           //add code here.
           return s.isEmpty();
	}
}