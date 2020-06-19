package gcd_five;

public class Gcd {
	public int gcd(int a,int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}

}
