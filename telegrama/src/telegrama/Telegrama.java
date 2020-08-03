package telegrama;

public class Telegrama {
	public static void main(String[] args) {
		String msg = "Feliz aniversario 2!";
		char[] chars = msg.toCharArray();
		int price = 0;
		for(char c : chars) {
			if(c >= '0' && c <= '9' ) {
				price += 20;
			} else if((c >= 'a' && c <= 'z') || (c >=  'A' && c <=  'Z')) {
				price +=10;
			}
			else if(c == ' ');
			else {
				price+=30;
			}
		}
		System.out.println(price);
		
	}
}
