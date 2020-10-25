
//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
	ArrayList <Integer> printBoundary(Node node)
	{
	    ArrayList<Integer> al=new ArrayList<>();
	    if(node!=null)al.add(node.data);
	    leftbound(node.left,al);
	    leaf(node.left,al);
	    leaf(node.right,al);
	    rightbound(node.right,al);
	    return al;
	}
	void leftbound(Node node,ArrayList<Integer> al){
	    if(node!=null){
	        if(node.left!=null){
	            al.add(node.data);
	            leftbound(node.left,al);
	        }
	        else if(node.right!=null){
	            al.add(node.data);
	            leftbound(node.right,al);
	        }
	    }
	}
	void leaf(Node node,ArrayList<Integer> al){
	    if(node!=null){
	        leaf(node.left,al);
	        if(node.left==null&&node.right==null)
	        al.add(node.data);
	        leaf(node.right,al);
	    }
	}
	void rightbound(Node node, ArrayList <Integer> res)
	{
		if(node != null)
		{
			if(node.right != null)
			{
				rightbound(node.right, res);
				res.add (node.data);
			}else if(node.left != null)
			{
				rightbound(node.left, res);
				res.add (node.data);
			}
		}
		
	}
}
