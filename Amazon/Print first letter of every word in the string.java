class Solution {
    String firstAlphabet(String S) 
    {
        // code here
        String ar[]=S.split(" ");
	    StringBuilder ans=new StringBuilder("");
	    for(String a:ar)
	    {
	        ans.append(a.charAt(0));
	    }
	    return ans.toString();
    }
};