package binaryconversion;

public class Conversion {

	public static void main(String[] args) {
		int decimal = 5;
		DecimalToBinary dec_to_bin = new DecimalToBinary();
		String binary = dec_to_bin.convert(decimal);
		System.out.printf("decimal: %d \nbinary: "+binary,decimal);
	}

}
