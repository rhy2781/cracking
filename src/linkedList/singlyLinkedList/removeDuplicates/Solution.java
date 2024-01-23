package linkedList.singlyLinkedList.removeDuplicates;

import linkedList.singlyLinkedList.node;

public class Solution {
	public static void printList(node n){
		while(n != null){
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		node head = new node(100);
		node one = new node(120);
		node two = new node(96);
		node three = new node(34);
		node four = new node(56);
		node five = new node(96);
		node six = new node(96);

		head.next = one;
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;


		printList(head);
		iterativeApproach ia = new iterativeApproach();
		ia.removeDuplicates(head);
		printList(head);
	}
}
