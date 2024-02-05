class Solution {
    public Node sortedInsert(Node head, int data) {
        Node n = new Node(data);
       
       // here if list is empty 
        if(head == null ){
            n.next = n;
            return n ;
        }
        // insertion in the head 
        if(head.data >=  data ){
        Node temp = head ;
        while(temp.next!= head){
            temp = temp.next;
        }
        temp.next = n ;
        n.next = head ;
        head = n;
       return n ;
        }
        
        // here is the insertion in between nodes
       Node temp = head;
       while(temp.next!= head && temp.next.data < data){
           temp =temp.next;
       }
       n.next = temp.next;
       temp.next = n;
       return head;
    }
}

