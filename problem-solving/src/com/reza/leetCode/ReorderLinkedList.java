package com.reza.leetCode;
import com.reza.leetCode.definition.ListNode;

public class ReorderLinkedList {

	public static void main(String[] args) {
		// test cases 
		// head = [1,2,3,4,5] ->	Output: [1,5,2,4,3]
		ListNode lst = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))); 
		printListNode(lst);
		reorderListII(lst);
		printListNode(lst);

	}
	
	public static void printListNode(ListNode head) {
		while(head != null) {
			System.out.print(head.val + ", ");
			head = head.next; 
		}
		System.out.println();
	}
	
	// recursive- no extra space 
	static ListNode cursor; 
	static boolean flag = false; 
	public static void reorderListII(ListNode head) {
		cursor = head; 
		ListNode tail = cursor; 
		reOrder(tail); 
		
	}
	public static void reOrder(ListNode tail) {
		if(tail == null) {
			return; 
		}
		reOrder(tail.next);
		
		if(flag == true) {
			return; 
		}
		ListNode p = cursor.next; 
		if(p == tail) {
			tail.next = null; 
			flag = true;
			return; 
		}
		cursor.next = tail; 
		tail.next = p; 
		if(p.next == tail) {
			p.next = null; 
			flag = true;
			return; 
		}
		cursor = p; 
	}
	
	// with extra space O(n). Time O(n) 
	public static void reorderList(ListNode head) {
		if( head == null || head.next == null) {
			return; 
		}
		
		ListNode root = head; 
		ListNode reversed = new ListNode(root.val); 
		
		int count = 1; 
		while (root.next != null) {
			root = root.next; 
			ListNode tempNode = new ListNode(root.val); 
			tempNode.next = reversed; 
			reversed = tempNode; 
			count++; 
		}
		ListNode p1 = head; 
		count--; //5
		while (count > 0) {
			p1 = head.next; 
			head.next = reversed;
			count--; //4,2,0
			if(count == 0) {
				head.next.next = null; 
				head= head.next; 
				break; 
			}else {
				reversed = reversed.next;
				head.next.next = p1; 
				head = p1;
				count--; //3,1
			}			
		}
		head.next = null; 
		
	}
}


