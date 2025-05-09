package linkedList.leetcode;

public class FindKthNode {
	

	    private Node head;
	    private Node tail;

	    class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	        }
	    }

	    public FindKthNode(int value) {
	        Node newNode = new Node(value);
	        head = newNode;
	        tail = newNode;
	    }

	    public Node getHead() {
	        return head;
	    }

	    public Node getTail() {
	        return tail;
	    }

	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.println(temp.value);
	            temp = temp.next;
	        }
	    }

	    public void printAll() {
	        if (head == null) {
	            System.out.println("Head: null");
	            System.out.println("Tail: null");
	        } else {
	            System.out.println("Head: " + head.value);
	            System.out.println("Tail: " + tail.value);
	        }
	        System.out.println("\nLinked List:");
	        if (head == null) {
	            System.out.println("empty");
	        } else {
	            printList();
	        }
	    }
	    
	    public void makeEmpty() {
	        head = null;
	        tail = null;
	    }

	    public void append(int value) {
	        Node newNode = new Node(value);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

		public Node findKthFromEnd(int k) {
			Node slow=head;
			Node fast=head;
			for(int i=0;i<k;i++) {
				if(fast==null) {
					return null;
				}
				fast=fast.next;
				int a=fast.value;
				System.out.println("Fast for loop "+a);
			}
			
			while(fast!=null) {
				slow=slow.next;
				System.out.println("slow while loop "+slow.value);
				fast=fast.next;
				System.out.println("Fast while  loop "+fast.value);
			}	
			
			return slow;
			
		}

		

	}




