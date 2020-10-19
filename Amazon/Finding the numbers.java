class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int a=0;
        for(int i:nums)
        {
            a=a^i;
        }
        int x=0;
        int y=0;
        int pos=0;
        for(int i=31;i>=0;i++)
        {
            if(((a>>i)&1)==1)
            {
                pos=i;
                break;
            }
        }
        
        for(int i:nums)
        {
            if(((i>>pos)&1)==0)
            {
                x=x^i;
            }
            else
            {
                y=y^i;
            }
        }
        int ar[]= new int[]{x,y};
        Arrays.sort(ar);
        return ar;
    }
}