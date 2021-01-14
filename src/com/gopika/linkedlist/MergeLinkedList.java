package com.gopika.linkedlist;

public class MergeLinkedList {

	public static void main(String[] args) {
		// We have 2 linked list. two indices are given a and b. from  index a to b in list 1 insert list 2
		
		SinglyLinkedList list1 = new SinglyLinkedList(1);
		SinglyLinkedList node1 = new SinglyLinkedList(2);
		SinglyLinkedList node2 = new SinglyLinkedList(3);
		SinglyLinkedList node3 = new SinglyLinkedList(4);
		
		list1.next = node1;
		node1.next = node2;
		node2.next = node3;
		
		SinglyLinkedList list2 = new SinglyLinkedList(5);
		SinglyLinkedList node4 = new SinglyLinkedList(6);
		SinglyLinkedList node5 = new SinglyLinkedList(7);
		SinglyLinkedList node6 = new SinglyLinkedList(8);
		
		list2.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		SinglyLinkedList runner1 = list1;
		SinglyLinkedList runner2 = list2;
		
		while(runner1!=null) {
			System.out.print(runner1.data+"->");
			runner1 = runner1.next;
		}
		System.out.println("");
		
		while(runner2!=null) {
			System.out.print(runner2.data+"->");
			runner2 = runner2.next;
		}
		System.out.println("");
		
		//start and end indices
		int start=1, end=2;
		
		
		SinglyLinkedList tempNode;
		runner1 = list1;
		runner2 = list2;
		int currentIndex=0;
		
		while(runner2.next!=null) {
			runner2 = runner2.next;
		}
		
		if(start == 1 && start == end) {
			runner2.next = runner1.next;
			list1 = list2;
		}else {
			while(runner1!=null) {
				currentIndex++;
				
				if(start == 1) {
					tempNode = runner1;
					list1 = list2;
					
				}
				
				if(currentIndex == start-1 || (start ==1 && currentIndex ==1)) {
					
					if(start == 1) {					
						list1 = list2;						
					}else {
						
						if(start == end) {
							runner2.next = runner1.next.next;
							runner1.next = list2;					
							break;					
						}	
						
					}
					
					tempNode = runner1;

					while(currentIndex<end) {
						currentIndex++;
						runner1 = runner1.next;
					}
					
					
					tempNode.next = list2;
					runner2.next = runner1.next;
					break;
		
				}else {
					runner1 = runner1.next;
				}
				
			}

		}
		
		runner1 = list1;
		
		
		while (runner1 != null) {
			System.out.print(runner1.data + "->");
			runner1 = runner1.next;
		}
		 

	}
	

}
