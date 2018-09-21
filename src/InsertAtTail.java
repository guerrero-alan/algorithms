/*
 * 
 * Write a method to insert a node at the end of a singly-linked list. Return the head of the modified list.
 * 
 * Runtime Complexity 
	O(n)
	
	Space Complexity 
	O(1)
 */

public class InsertAtTail {
	public ListNode insertAtTail(ListNode head, int data) {
	    if(head == null)    return new ListNode(data);
	    
	    ListNode copy = head;
	    
	    while(copy.next != null) {
	        copy = copy.next;
	    }
	    
	    copy.next = new ListNode(data);
	    return head;
	}
}

class ListNode {
    int data;
    ListNode next;        
    ListNode(int data) { this.data = data; }
 }  

