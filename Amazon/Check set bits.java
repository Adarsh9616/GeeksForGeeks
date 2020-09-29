class Solution{
    static int isBitSet(int N)
    {
        int count=0;
        for(int i=31;i>=0;i--)
        {
            if(((N>>i)&1)!=0)
            {
                count=1;
            }
            if(((N>>i)&1)==0&&count==1)
            {
                return 0;
            }
        }
        return 1;
    }
}