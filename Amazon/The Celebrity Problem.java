
class Solution { 
    int celebrity(int M[][], int n)
    {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        {
            s.push(i);
        }
        while(s.size()>1)
        {
            int a=s.pop();
            int b=s.pop();
            if(M[a][b]==1)
            {
                s.push(b);
            }
            else
            {
                s.push(a);
            }
        }
        int candidate=s.pop();
        for(int i=0;i<n;i++)
        {
            if(i==candidate)
            {
                continue;
            }
            else
            {
                if(M[i][candidate]==0||M[candidate][i]==1)
                {
                    return -1;
                }
            }
        }
        return candidate;
    }
}