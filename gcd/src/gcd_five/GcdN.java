package gcd_five;

public class GcdN {
	public int gcd(int... args) {
		Gcd gcd2 = new Gcd();
		BubbleSort bubble = new BubbleSort();
		int[] sorted = bubble.sort(args);
		int divisor = sorted[0];
		for(int x: sorted) {
			divisor = gcd2.gcd(divisor,x);
		}			
		return divisor;
	}
}
