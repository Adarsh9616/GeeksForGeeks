class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		sortUtil(s);
		return s;
	}
	public void sortUtil(Stack<Integer> s)
	{
	    if(!s.isEmpty())
	    {
	        int k=s.pop();
	        sortUtil(s);
	        
	        insertSorted(s,k);
	    }
	}
	public void insertSorted(Stack<Integer> s,int k)
	{
	    if(s.isEmpty()||s.peek()<k)
	    {
	        s.push(k);
	        return;
	    }
	    int temp=s.pop();
	    insertSorted(s,k);
	    s.push(temp);
	}
}