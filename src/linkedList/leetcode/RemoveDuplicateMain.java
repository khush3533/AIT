package linkedList.leetcode;

public class RemoveDuplicateMain {

	    public static void main(String[] args) {

	    	RemoveDuplicate myLinkedList = new RemoveDuplicate(1);

	        myLinkedList.append(1);
	        myLinkedList.append(2);
	        myLinkedList.append(2);
	        myLinkedList.append(3);
	        myLinkedList.append(3);
	        myLinkedList.append(3);
	        myLinkedList.append(4);

	        myLinkedList.removeDuplicates();

	        myLinkedList.printList();

	        /*
	            EXPECTED OUTPUT:
	            ----------------
	            1
	            2
	            3
	            4
	            
	        */
	        
	    }
	    
	}
