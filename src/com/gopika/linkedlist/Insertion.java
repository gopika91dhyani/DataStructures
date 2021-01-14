package com.gopika.linkedlist;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList head = new SinglyLinkedList(3);
		SinglyLinkedList node1 = new SinglyLinkedList(4);
		SinglyLinkedList node2 = new SinglyLinkedList(5);
		SinglyLinkedList node3 = new SinglyLinkedList(6);
		SinglyLinkedList node4 = new SinglyLinkedList(7);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		//node to be inserted
		SinglyLinkedList newNode = new SinglyLinkedList(8);
		
		//inserting at end of list
		
		SinglyLinkedList runner = head;
		
		while(runner.next!=null) {
			runner= runner.next;
		}
		
		runner.next = newNode;
		
		
		//inserting at a particular index
		int in = 3; //insert at index 2
		int index = 0;
		SinglyLinkedList insertNode = new SinglyLinkedList(10);
		SinglyLinkedList tempNode;
		runner = head;
		
		while(runner.next!=null) {
			index++;
			if(index == (in-1)) {
				tempNode = runner.next;
				runner.next = insertNode;
				insertNode.next = tempNode;
				break;
			}else {
				runner = runner.next;
			}
			
		}
		
		//search for a particular data and insert at that position
		int searchData = 7;
		SinglyLinkedList insert = new SinglyLinkedList(25);
		runner=head;
		while(runner.next!=null) {
			
			if(runner.next.data == searchData) {
				tempNode = runner.next;
				runner.next = insert;
				insert.next = tempNode;
				break;
				
			}else {
				runner = runner.next;
			}

		}
		
		//traverse the new List
		SinglyLinkedList r = head;
		while(r!=null) {
			System.out.println(r.data);
			r=r.next;
		}
		
		
		
		
		

	}

}
