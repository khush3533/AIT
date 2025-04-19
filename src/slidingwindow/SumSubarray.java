package slidingwindow;

import java.util.ArrayList;

public class SumSubarray {
	public static void main(String[] args) {
		ArrayList<Integer> d=new ArrayList<Integer>();
		
		d.add(100);
		d.add(200);
		d.add(250);
		d.add(300);
		int subarraySize=2;
		int sizeofArray=4;
		long num=maximumsubarray(d,subarraySize,sizeofArray);
		System.out.println(num);
	}

	private static long maximumsubarray(ArrayList<Integer> d, int k, int n) {
		
		long maxSum=0;
		long sum=0;
		int index=0;
		while(index<n &&index<k) {
			sum+=d.get(index);
			index++;
		}
		maxSum=sum;
		for(int i=1;i<n-k+1;i++) {
			int preel=d.get(i-1);
			int nextel=d.get(i+k-1);
			sum=sum-preel+nextel;
			maxSum=Math.max(maxSum, sum);
			
		}
		
		
		
		
		return maxSum;
	}

}
