package linkedList.leetcode;



public class MiddleMain {


	    public static void main(String[] args) {

	    	MiddleNode myLinkedList = new MiddleNode(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);
	        myLinkedList.append(4);
	        myLinkedList.append(5);
	        

	        System.out.println("1 -> 2 -> 3 -> 4 -> 5");
	        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);
	       // System.out.println(myLinkedList.);
	        
	        myLinkedList.append(6);
	        
	        
	        System.out.println("===========================");
	        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
	        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);


	        /*
	            EXPECTED OUTPUT:
	            ----------------
	            1 -> 2 -> 3 -> 4 -> 5
	            Middle Node: 3
	            ===========================
	            1 -> 2 -> 3 -> 4 -> 5 -> 6
	            Middle Node: 4

	        */

	    }

	

}
