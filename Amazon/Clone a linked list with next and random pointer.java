class Clone {
    Node copyList(Node start) 
    {
        Node curr = start, temp = null;  
        while (curr != null)  
        {  
            temp = curr.next;  
            curr.next = new Node(curr.data);  
            curr.next.next = temp;  
            curr = temp;  
        }  
        curr = start; 
        while (curr != null)  
        {  
            if(curr.next != null) 
            {
                curr.next.arb = (curr.arb != null) ? curr.arb.next : curr.arb;  
            }
            
            curr = (curr.next != null) ? curr.next.next : curr.next;  
        }  
      
        Node original = start, copy = start.next;  
        temp = copy;  
        
        while (original != null && copy != null)  
        {  
            original.next = (original.next != null)?  
                        original.next.next : original.next;  
      
            copy.next = (copy.next != null) ? copy.next.next  
                                                : copy.next;  
            original = original.next;  
            copy = copy.next;  
        }  
        return temp;  
    }
}

