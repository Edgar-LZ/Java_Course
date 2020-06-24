package binaryconversion;
import java.lang.StringBuilder;

public class DecimalToBinary {
	public String convert(int decimal) {
		StringBuilder binary = new StringBuilder();
		while(decimal > 0) {
			binary.append(decimal%2); 
			decimal /=2;
		}
		return binary.toString();
	}
}
