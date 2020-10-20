class Solution{
    static int nCr(int n, int r)
    {
        int C[] = new int[r + 1]; 
        int p=1000000007;
        C[0] = 1; 
        for (int i = 1; i <= n; i++) 
        { 
            for (int j = Math.min(i, r); j > 0; j--)
                C[j] = (C[j] + C[j - 1]) % p; 
        } 
        return C[r]; 
    }
}