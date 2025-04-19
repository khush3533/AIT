package linkedList.leetcode;

public class BinarytoDecimalMain {
	//BinarytoDecimal
	

	    
	    public static void main(String[] args) {
	        
	        // ---------------
	        // Convert 1011 to 11
	        // ---------------
		BinarytoDecimal list1 = new BinarytoDecimal(1);
	        list1.append(0);
	        list1.append(1);
	        list1.append(1);
	        System.out.println("Convert 1011 to 11:");
	        System.out.println("Input: 1 -> 0 -> 1 -> 1");
	        System.out.println("Output: " + list1.binaryToDecimal());
	        System.out.println("---------------");

	        // ---------------
	        // Convert 1100 to 12
	        // ---------------
	        BinarytoDecimal list2 = new BinarytoDecimal(1);
	        list2.append(1);
	        list2.append(0);
	        list2.append(0);
	        System.out.println("Convert 1100 to 12:");
	        System.out.println("Input: 1 -> 1 -> 0 -> 0");
	        System.out.println("Output: " + list2.binaryToDecimal());
	        System.out.println("---------------");

	        // ---------------
	        // Convert 1 to 1
	        // ---------------
	        BinarytoDecimal list3 = new BinarytoDecimal(1);
	        System.out.println("Convert 1 to 1:");
	        System.out.println("Input: 1");
	        System.out.println("Output: " + list3.binaryToDecimal());
	        System.out.println("---------------");

	        // ---------------
	        // Convert empty list to 0
	        // ---------------
	        BinarytoDecimal list4 = new BinarytoDecimal(0);
	        list4.makeEmpty();
	        System.out.println("Convert empty list to 0:");
	        System.out.println("Input: empty");
	        System.out.println("Output: " + list4.binaryToDecimal());
	        System.out.println("---------------");
	    }
	    
	}




