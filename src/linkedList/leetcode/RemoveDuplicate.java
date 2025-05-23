package linkedList.leetcode;

import java.util.HashSet;

public class RemoveDuplicate {

	private Node head;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public RemoveDuplicate(int value) {
		Node newNode = new Node(value);
		head = newNode;
		length = 1;
	}

	public Node getHead() {
		return head;
	}

	public int getLength() {
		return length;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printAll() {
		if (length == 0) {
			System.out.println("Head: null");
		} else {
			System.out.println("Head: " + head.value);
		}
		System.out.println("Length:" + length);
		System.out.println("\nLinked List:");
		if (length == 0) {
			System.out.println("empty");
		} else {
			printList();
		}
	}

	public void makeEmpty() {
		head = null;
		length = 0;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		length++;
	}

	public void removeDuplicates() {
		// TODO Auto-generated method stub
		HashSet<Integer> values = new HashSet<Integer>();
		Node previouse = null;
		Node current = head;

		while (current != null) {
			if (values.contains(current.value)) {
				previouse.next = current.next;
				length--;
			} else {
				values.add(current.value);
				previouse = current;
			}
			current = current.next;
		}

	}




}
