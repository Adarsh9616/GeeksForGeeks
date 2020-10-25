
/* A binary search tree node class

class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
}
*/
// your task is to complete the below function
class Tree
{
    int min=Integer.MAX_VALUE;
    int minValue(Node node)
    {
        if(node==null)
        {
            return min;
        }
        if(node.data<min)
        {
            min=node.data;
        }
        
        minValue(node.left);
        minValue(node.right);
        return min;
    }
}

