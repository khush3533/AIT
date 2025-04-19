package linkedList;

public class RevreseLinkedlIst {
	Node head;

	public void add(int data) {
		if (head == null) {
			head = new Node(data);

		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}
	}
	
	public void display() {
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public void revercetive() {
		Node previous=null;
		Node current=head;
		Node next=null;
		
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		head=previous;
	}
	
	public void reverseRecursion() {
		head=reverseRecusiveHelper(head,null);
	}

	private Node reverseRecusiveHelper(Node current, Node previous) {
		if(current==null) {
			return previous;
		}
		Node next=current.next;
		current.next=previous;
		return reverseRecusiveHelper(next,current);
	//	return null;
	}

}
