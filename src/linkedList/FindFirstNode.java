package linkedList;

public class FindFirstNode {
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(3);
		head.next.next=new Node(4);
		head.next.next.next=new Node(5);
		head.next.next.next.next=head.next.next;
		
		Node loopStart=findFirstNodeOfLoop(head);
	}

	private static Node findFirstNodeOfLoop(Node head) {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null ) {
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast) {
				break;
			}
		}
		if(fast==null||fast.next==null) {
			return null;
		}
		slow=head;
		while(slow!=fast) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}

}
