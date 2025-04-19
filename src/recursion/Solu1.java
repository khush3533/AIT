package recursion;

public class Solu1 {
	 public static void main(String[] args) {
		toBinary(10);
	}

	private static void toBinary(int i) {
		// TODO Auto-generated method stub
		if(i==0) {
			return;
		}
		toBinary(i/2);
		System.out.println(i%2);
		
	}

}
