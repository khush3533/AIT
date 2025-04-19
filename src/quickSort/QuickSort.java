package quickSort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] myarray = { 4, 6, 1, 7, 3, 2, 5 };
		quickSort(myarray);
		System.out.println(Arrays.toString(myarray));
	}

	private static void quickSort(int[] myarray) {
		quickSortHelper(myarray, 0, myarray.length - 1);
	}

	private static void quickSortHelper(int[] myarray, int start, int end) {
		if (start < end) {
			int pivotIndex = pivot(myarray, start, end);
			quickSortHelper(myarray, start, pivotIndex - 1);
			quickSortHelper(myarray, pivotIndex + 1, end);
		}

	}

	private static int pivot(int[] myarray, int start, int end) {
		int swapindex = start;
		for (int i = start + 1; i <= end; i++) {
			if (myarray[i] < myarray[start]) {
				swapindex++;
				swap(myarray, swapindex, i);

			}
		}
		swap(myarray, start, swapindex);
		return swapindex;
	}

	private static void swap(int[] myarray, int swapindex, int end) {
		int temp = myarray[swapindex];
		myarray[swapindex] = myarray[end];
		myarray[end] = temp;
	}

}
