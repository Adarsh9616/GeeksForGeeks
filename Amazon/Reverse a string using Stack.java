
class Solution {
    
    public void reverse(String str)
    {
        Stack<Character> s=new Stack<>();
        for(char c:str.toCharArray())
        {
            s.push(c);
        }
        StringBuilder ss=new StringBuilder("");
        while(!s.isEmpty())
        {
            ss.append(s.pop());
        }
        System.out.println(ss.toString());
    }

}