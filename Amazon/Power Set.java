class Solution
{
    List<String> ans=new ArrayList<>();
    public List<String> AllPossibleStrings(String s)
    {
        char c[]=s.toCharArray();
        solve(c,0,"");
        Collections.sort(ans);
        ans.remove(0);
        return ans;
    }
    public void solve(char c[],int i,String a)
    {
        if(i>=c.length)
        {
            ans.add(a);
            return;
        }
        solve(c,i+1,a+c[i]);
        solve(c,i+1,a);
    }
}