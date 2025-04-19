package slidingwindow;

public class SmallestSubarraywithSum {
	public static void main(String[] args) {
		int a[]= {0,0,0,0,10,29,31};
		int  n=40;
		int k=7;
		System.out.println(smallests(a,n,k));;
	}

	private static int smallests(int[] a, int n, int k) {
		int windowStart=0;
		int windowEnd=0;
		int sum=0;
		int minLen=Integer.MAX_VALUE;
		int len=0;
		while(windowEnd<k) {
			sum+=a[windowEnd];
			if(sum>n) {
				len=windowEnd-windowStart+1;
				minLen=Math.min(minLen, len);
				while(windowStart<windowEnd && sum>n) {
					sum-=a[windowStart];
					windowStart++;
					if(sum>n) {
						len=windowEnd-windowStart+1;
						minLen=Math.min(minLen, len);
					}
					
				}
			}
			windowEnd++;
			
		}
		
		return (minLen==Integer.MAX_VALUE)?0:minLen;
	}

}
