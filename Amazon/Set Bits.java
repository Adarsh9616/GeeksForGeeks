class Solution{
    static int setBits(int N)
    {
        if(N==0)
        {
            return 0;
        }
        int count=0;
        for(int i=31;i>=0;i--)
        {
            if(((N>>i)&1)==1)
            {
                count++;
            }
        }
        return count;
    }
}