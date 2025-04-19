package doublyLinkedList;

public class AppendMain  {

    public static void main(String[] args) {

    	Append myDLL = new Append(1);
        myDLL.append(2);

        myDLL.printAll();
        
        
        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2
        
        	Doubly Linked List:
        	1
        	2
        
     	*/

    }
    
}