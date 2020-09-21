class Solution {
    void matchPairs(char nuts[], char bolts[], int n) 
    {
        HashMap<Character,Integer> m=new HashMap<>();
        Arrays.sort(nuts);
        for(int i=0;i<n;i++)
        {
            m.put(nuts[i],i);
        }
        for(int i=0;i<n;i++)
        {
            if(nuts[i]!=bolts[i])
            {
                
                int temp=m.get(bolts[i]);
                char c=bolts[temp];
                bolts[temp]=bolts[i];
                bolts[i]=c;i--;
            }
        }
    }
}