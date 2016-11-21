package com.panand.linkedlist;

class Node {

	int data;
	Node next;
	
}

public class Elements {

	static void Print(Node head) {
		do {
			boolean canBreak = false;
			if (head.next == null) {
				canBreak=true;
			}
			System.out.println(head.data);
			head = head.next;
			if(canBreak) {
				break;
			}
		} while(true);
		
	}
	
	public static void main(String[] args) {

		Node node3 = new Node();
		node3.data = 3;
		node3.next = null;
		
		Node node2 = new Node();
		node2.data = 2;
		node2.next = node3;
		
		Node node1 = new Node();
		node1.data = 1;
		node1.next = node2; 
		
		Print(node1);
		
	}
}
