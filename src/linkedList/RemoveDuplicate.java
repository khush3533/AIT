package linkedList;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(1);
		head.next.next=new Node(2);
		head.next.next.next=new Node(3);
		head.next.next.next.next=new Node(4);
		
		removeDuplicate(head);
		
	}

	private static void removeDuplicate(Node head) {
		Node current=head;
		
		while(current!=null && current.next!=null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}else {
				current=current.next;
			}
		}
	}

}
