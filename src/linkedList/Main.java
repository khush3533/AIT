package linkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList list=new LinkedList(3);
		//list.getClass();
		list.getHead();
		list.getTail();
		list.getLength();
		list.printList();
		list.append(4);
		list.removeLast();
		list.set(1, 4);
		list.printList();
	}

}
