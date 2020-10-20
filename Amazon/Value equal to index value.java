
class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(ar[i]==i)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}