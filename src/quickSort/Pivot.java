package quickSort;

import java.util.Arrays;

public class Pivot {
	
	public static void main(String[] args) {
		int[] a= {4,6,1,7,3,2,5};
		   
		pivot(a,0,6);
		System.out.println(Arrays.toString(a));
		
	}

	private static int pivot(int[] a, int pivotIndex, int endIndex) {
		int swapindex=pivotIndex;
		for(int j=pivotIndex+1;j<=endIndex;j++) {
			if(a[j]<a[pivotIndex]) {
				swapindex++;
				swap(a,swapindex,j);
			}
		}
		swap(a,pivotIndex,swapindex);
		System.out.println(swapindex);
		return swapindex;
	}

	private static void swap(int[] a, int firstIndex, int endIndex) {
		int temp=a[firstIndex];
		a[firstIndex]=a[endIndex];
		a[endIndex]=temp;
	}
	
	

}
