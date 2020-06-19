package binaryconversion;

public class DecimalToBinary {
	public String convert(int decimal) {
		String binary = "";
		while(decimal > 0) {
			int remainder = decimal%2; 
			decimal /=2;
			binary = Integer.toString(remainder)+binary;
		}
		return binary;
	}
}
