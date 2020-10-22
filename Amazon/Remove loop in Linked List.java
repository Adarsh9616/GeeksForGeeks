
/*
class Node
{
    int data;
    Node next;
}
*/

class solver
{
    public static void removeLoop(Node head)
    {
        HashSet<Node> set = new HashSet<>();
          
        Node temp = head;
        Node prev = head;
        while (temp != null || set.contains(temp)) {
            if (set.contains(temp)) {
                prev.next = null;
                break;
            }
            else {
                set.add(temp);
            }
            //System.out.println(temp.data);
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return;
    }
}