package palindrome;

public class Palindrome {
	public boolean isPalindrome(String str) {
		
		String punc = " .,;!-'?_\"";
		String seq = "";
		for(int i=0; i< str.length();i++) {
			if(!punc.contains(""+str.charAt(i))) {
				seq = seq+ str.charAt(i);
			}
		}
		seq = seq.toLowerCase();
		for(int i=0; i< seq.length();i++)
			if(seq.charAt(i) !=seq.charAt(seq.length()-i-1))
				return false;
		
		return true;
	}
}
