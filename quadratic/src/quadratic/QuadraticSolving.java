package quadratic;

public class QuadraticSolving {
	public String[] solve(double a, double b, double c) {
		String[] arr = new String[2];
		double d = Math.pow(b, 2.0) - 4.0*a*c;
		double real = -b/(2*a);
		double rad1 = (Math.pow(Math.abs(d),0.5))/(2*a);
		double rad2 = -(Math.pow(Math.abs(d),0.5))/(2*a);
		if(d < 0) {
			arr[0] = Double.toString(real) + "+" + Double.toString(rad1)+"i";
			arr[1] = Double.toString(real) + Double.toString(rad2)+"i";
			return arr;
		}
		arr[0] = Double.toString(real+rad1);
		arr[1] = Double.toString(real+rad2);
		return arr;
	}
}
