package recursion;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		char[] s= {'s','k','l','j'};
		reverse(s);
		System.out.println(Arrays.toString(s));
		//System.out.println(Arrays.deepToString(reverse(s));
	}

	public static void reverse(char[] s) {
		recur(s,0);
		
		
	}

	private static void recur(char[] s, int i) {
		if(i==s.length/2) {
			return;
			
		}
		recur(s, i+1);
		swap(s,i,s.length-i-1);
		
	}

	private static void swap(char[] s, int i, int j) {
		// TODO Auto-generated method stub
		char temp=s[i];
		s[i]=s[j];
		s[j]=temp;
		
	}

}
