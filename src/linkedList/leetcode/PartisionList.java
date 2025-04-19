package linkedList.leetcode;

public class PartisionList {
	

	    private Node head;
	    private int length;

	    class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	        }
	    }

	    public PartisionList(int value) {
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
	    public void partitionList(int x) {
	    	if(head==null) return;
	    	Node dummy1=new Node(0);
	    	Node dummy2=new Node(0);
	    	Node prev1=dummy1;
	    	Node prev2=dummy2;
	    	Node current=head;
	    	
	    	while(current!=null) {
	    		
	    	}
	    



	    }
}
