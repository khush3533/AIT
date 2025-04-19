package linkedList;

public class FindLoop {
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		if(hasLoop(head)) {
			System.out.println("loop detected in the ll");
		}else {
			System.out.println("No loop detected in ll");
		}
	}

	private static boolean hasLoop(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}

}
