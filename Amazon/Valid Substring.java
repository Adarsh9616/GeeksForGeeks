
//User function Template for Java
class Solution {
    static int findMaxLen(String s) 
    {
        int n=s.length();
        int open=0;
        int close=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;
            }
            else 
            {
                close++;
            }
            if(open==close)
            {
                max=Math.max(max,2*close);
            }
            else if(close>open)
            {
                open=close=0;
            }
        }
        open=close=0;
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==')')
            {
                close++;
            }
            else
            {
                open++;
            }
            if(open==close)
            {
                max=Math.max(max,2*open);
            }
            else if(open>close)
            {
                open=close=0;
            }
        }
        return max;
    }
};