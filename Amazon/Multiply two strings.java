
class Sol
{
    public String multiply(String a,String b)
    {
        if(a.equals("0")||b.equals("0"))
        {
            return "0";
        }
        int mul[]=new int[a.length()*b.length()+1];
        char ac=a.charAt(0);
        char bc=b.charAt(0);
        int count=0;
        if(ac=='-')
        {
            count++;
            a=a.substring(1);
        }
        if(bc=='-')
        { 
            count++;
            b=b.substring(1);
        }
        boolean sign=count%2!=0;
        a=new StringBuilder(a).reverse().toString();
        b=new StringBuilder(b).reverse().toString();
        int n=a.length();
        int m=b.length();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mul[i+j]=mul[i+j]+((a.charAt(i)-'0')*(b.charAt(j)-'0'));
            }
        }
        String ans="";
        for(int i=0;i<n+m;i++)
        {
            int digit=mul[i]%10;
            int carry=mul[i]/10;
            if(i+1<n+m)
            {
                mul[i+1]+=carry;
            }
            ans=digit+ans;
        }
        while(ans.length()>1&&ans.charAt(0)=='0')
        {
            ans=ans.substring(1);
        }
        if(sign)
        {
            ans='-'+ans;
        }
        return ans;
    }
}