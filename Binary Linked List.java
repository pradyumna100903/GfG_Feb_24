/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
 */

class Solution
{
   long DecimalValue(Node head)
   {
 	long sum=0;
     Node curr=head;
     while(curr!=null){
         sum*=2;
         sum=(sum+curr.data)%1000000007;
         curr=curr.next;
     }
     return sum;
   }
}
