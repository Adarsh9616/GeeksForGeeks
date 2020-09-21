class Solution {
    int findKRotation(int arr[], int n) 
    {
        return solve(arr,0,n-1);
    }
    int solve(int ar[],int l,int u)
    {
        if(l>u)
        {
            return 0;
        }
        if(u==l)
        {
            return u;
        }
        int mid=(l+u)/2;
        if(mid<u&&ar[mid]>ar[mid+1])
        {
            return mid+1;
        }
        if(mid>l&&ar[mid-1]>ar[mid])
        {
            return mid;
        }
        if(ar[u]>ar[mid])
        {
            return solve(ar,l,mid-1);
        }
        return solve(ar,mid+1,u);
    }
}