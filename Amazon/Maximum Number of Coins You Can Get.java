class Solution {
    public int maxCoins(int[] piles)
    {
        Arrays.sort(piles);
        int sum=0;
        int n=piles.length;
        int s=n/3-1;
        for(int i=n-2;i>=s;i-=2)
        {
            sum+=piles[i];
        }
        return sum;
    }
}