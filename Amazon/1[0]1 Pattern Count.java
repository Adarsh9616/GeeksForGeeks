class Solution 
{ 
    int patternCount(String s) 
    { 
        int count=0;
        for(int i=0;i<s.length();)
        {
            if(s.charAt(i)=='1')
            {
                i++;
                boolean check=false;
                while(i<s.length()&&s.charAt(i)=='0')
                {
                    i++;
                    check=true;
                }
                if(i<s.length()&&s.charAt(i)=='1'&&check)
                {
                    count++;
                }
            }
            else
            {
                i++;
            }
        }
        return count;
    }
} 