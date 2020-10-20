class Solution
{
    public int LongestBitonicSequence(int[] ar)
    {
        int n=ar.length;
        int lis[]=new int[n];
        int lds[]=new int[n];
        for(int i=0;i<n;i++)
        {
            lis[i]=1;
            lds[i]=1;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(ar[i]>ar[j]&&lis[i]<lis[j]+1)
                {
                    lis[i]=lis[j]+1;
                }
            }
        }
        //opposide direction
        for(int i=n-1;i>=0;i--)
        {
            for(int j=n-1;j>i;j--)
            {
                if(ar[i]>ar[j]&&lds[i]<lds[j]+1)
                {
                    lds[i]=lds[j]+1;
                }
            }
        }
        int max=lis[0]+lds[0]-1;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,lis[i]+lds[i]-1);
        }
        return max;
    }
}