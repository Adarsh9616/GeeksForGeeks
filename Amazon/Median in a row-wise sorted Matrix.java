
class Solution {
    int median(int matrix[][], int r, int c) 
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<r;i++)
        {
            max=Math.max(max,matrix[i][c-1]);
            min=Math.min(min,matrix[i][0]);
        }
        int desired=(r*c+1)/2;
        while(min<max)
        {
            int mid=(max+min)/2;
            int place=0;
            int pos=0;
            for(int i=0;i<r;i++)
            {
                pos=Arrays.binarySearch(matrix[i],mid);
                if(pos<0)
                {
                    pos=Math.abs(pos+1);
                }
                else 
                {
                    while(pos<matrix[i].length&&matrix[i][pos]==mid)
                    {
                        pos+=1;
                    }
                }
                place=place+pos;
            }
            if(place<desired)
            {
                min=mid+1;
            }
            else
            {
                max=mid;
            }
        }
        return min;
    }
}