package slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ChoclateDistribution {
	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(23);
		ar.add(45);
		ar.add(12);
		ar.add(45);
		ar.add(78);

		//Arrays.asList(10, 23, 45, 12, 45, 78);
		int sizeofAraay = ar.size();
		int subarray = 5;
		try {
			long i = findMindiff(ar, sizeofAraay, subarray);
			System.out.println(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static long findMindiff(ArrayList<Integer> ar, int sizeofAraay2, int subarray2) {
		Collections.sort(ar);
		long res=Long.MAX_VALUE;
		
		for(int i=0;i<sizeofAraay2-subarray2+1;i++) {
			int minv=ar.get(i);
			int max=ar.get(i+subarray2-1);
			res=Math.min(res,max-minv);
			
		}
		
		return res;
	}

}
