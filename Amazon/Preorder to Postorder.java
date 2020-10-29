
public static Node constructTree(int pre[], int size) 
{
    return solve(pre,0,size-1);
} 
public static Node solve(int pre[],int i,int j)
{
    if(i>j)
    {
        return null;
    }
    Node temp=new Node(pre[i]);
    if(i==j)
    {
        return temp;
    }
    int k;
    for(k=i+1;k<=j;k++)
    {
        if(pre[k]>pre[i])
        {
            break;
        }
    }
    temp.left=solve(pre,i+1,k-1);
    temp.right=solve(pre,k,j);
    return temp;
}