package linkedList;

public class RemoveLoop {
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=head.next.next;
		
		removeLoop(head);
	}

	private static void removeLoop(Node head) {
		Node slow=head;
		Node fast=head;
		
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast) {
				break;
			}
			
			if(fast==null||fast.next==null) {
				System.out.println("No loop Found");
				return;
			}
			
			slow=head;
			Node prev=null;
			
			while(slow!=fast) {
				prev=fast;
				slow=slow.next;
				fast=fast.next;
			}
			
			prev.next=null;
			System.out.println(slow.data);
		}
	}

}
