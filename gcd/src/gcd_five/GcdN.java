package gcd_five;

public class GcdN {
	public int gcdn(int... args) {
		BubbleSort bubble = new BubbleSort();
		int[] sorted = bubble.sort(args);
		int divisor = sorted[0];
		for(int x: sorted) {
			divisor = gcd2(divisor,x);
		}			
		return divisor;
	}
	
	public int gcd2(int a,int b) {
		if(a==0)
			return b;
		return gcd2(b%a,a);
	}
}
