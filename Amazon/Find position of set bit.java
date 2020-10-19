
class Solution {
    static int findPosition(int N) 
    {
        if(N==0)
        {
            return -1;
        }
        if((N&(N-1))==0)
        {
            for(int i=31;i>=0;i--)
            {
                if(((N>>i)&1)==1)
                {
                    return i+1;
                }
            }
        }
        else
        {
            return -1;
        }
        return -1;
    }
};