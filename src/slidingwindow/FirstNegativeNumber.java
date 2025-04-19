package slidingwindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumber {
	public static void main(String[] args) {
		long[] a = { -1, 4, 2, -4, -6, 5 };
		int windowSize = 3;
		int arraysize = 6;
		long[] d=firstNegativenum(a, windowSize, arraysize);
		System.out.println(Arrays.toString(d));
	}

	private static long[] firstNegativenum(long[] a, int windowSize, int arraysize) {
		Queue<Long> q = new LinkedList<Long>();
		int i = 0;
		while (i < windowSize) {
			if (a[i] < 0) {
				q.offer(a[i]);
			}
			i++;
		}

		long result[] = new long[arraysize - windowSize + 1];
		result[0] = (q.isEmpty()) ? 0 : q.peek();
		for (int j = 1; j < arraysize - windowSize + 1; j++) {
			if (a[j - 1] < 0) {
				q.poll();
			}

			if (a[j + windowSize - 1] < 0) {
				q.offer(a[j + windowSize - 1]);
			}
			
			result[j]=(q.isEmpty())?0:q.peek();

		}

		return result;
	}

}
