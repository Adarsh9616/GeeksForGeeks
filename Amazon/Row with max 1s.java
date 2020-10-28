
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) 
    {
        int max=0;
        int pos=-1;
        int lastK=m-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i][lastK]==0)
            {
                continue;
            }
            int k=binarySearch(arr[i]);
            int countOfOne=(k==-1)?0:(m-k);
            if(countOfOne>max)
            {
                max=countOfOne;
                pos=i;
            }
        }
        return pos;
    }
    int binarySearch(int ar[])
    {
        int l=0;
        int u=ar.length;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if((mid==0||ar[mid-1]==0)&&ar[mid]==1)
            {
                return mid;
            }
            else if(ar[mid]==0)
            {
                l=mid+1;
            }
            else
            {
                u=mid-1;
            }
        }
        return -1;
    }
    
}