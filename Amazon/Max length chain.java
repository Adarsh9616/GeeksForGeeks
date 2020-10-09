
class GfG implements Comparator<Pair>
{
    public int compare(Pair a,Pair b)
    {
        return a.y-b.y;
    }
    int maxChainLength(Pair arr[], int n)
    {
        List<Pair> ar=Arrays.asList(arr);
        Collections.sort(ar,new GfG());
        int curr=Integer.MIN_VALUE;
        int ans=0;
        for(Pair i:arr)
        {
            if(curr<i.x)
            {
                curr=i.y;
                ans++;
            }
        }
        return ans;
    }
}