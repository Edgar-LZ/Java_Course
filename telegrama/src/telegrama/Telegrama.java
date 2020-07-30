package telegrama;

public class Telegrama {
	public static void main(String[] args) {
		String msg = "Hola!!  ";
		int len = msg.length();
		int price = 0;
		for(int i=0;i<len;i++) {
			int ascii = (int) msg.charAt(i);
			if(ascii >= (int) '0' && ascii <= (int) '9' ) {
				price += 20;
			} else if(ascii >= (int) 'a' && ascii <= (int) 'z' || ascii >= (int) 'A' && ascii <= (int) 'Z') {
				price +=10;
			}
			else if(msg.charAt(i)==' ') {
				price+=0;
			}
			else {
				price+=30;
			}
		}
		System.out.println(price);
		
	}
}
