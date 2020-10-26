
//User function Template for Java

/*
Structure of node class is:
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    HashMap<String,Integer> map=new HashMap<>();
    ArrayList<Integer> ans=new ArrayList<>();
    public void printDup(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root);
        if(ans.size()!=0)
        {
            Collections.sort(ans);
            for(int i:ans)
            {
                System.out.print(i+" ");
            }
        }
        else
        {
            System.out.print(-1);
        }
        System.out.println();
    }
    public String inorder(Node root)
    {
        if(root==null)
        {
            return "";
        }
        String s="(";
        s+=inorder(root.left);
        s+=root.data;
        s+=inorder(root.right);
        s+=")";
        if(map.containsKey(s)&&map.get(s)==1)
        {
            ans.add(root.data);
        }
        map.put(s,map.getOrDefault(s,0)+1);
        return s;
    }
}