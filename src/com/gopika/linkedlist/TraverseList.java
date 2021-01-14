package com.gopika.linkedlist;

public class TraverseList {
	
	public static void main(String args[]) {
		
		//create a singly linked list
		
		SinglyLinkedList head = new SinglyLinkedList(1);
		SinglyLinkedList node2 = new SinglyLinkedList(2);
		SinglyLinkedList node3 = new SinglyLinkedList(3);
		SinglyLinkedList node4 = new SinglyLinkedList(4);
		
		head.next = node2;
		node2.next = node3;
		node3.next=node4;
		
		
		//to traverse
		SinglyLinkedList runner = head;
		
		while(runner!=null) {
			System.out.print(runner.data+"->");
			runner=runner.next;
		}
		
		
	}

}
