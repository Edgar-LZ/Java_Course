package palindrome;

public class Palindrome {
	public boolean isPalindrome(String str) {
		String pattern = "[^a-zA-Z]";
		StringBuilder seq = new StringBuilder(str.toLowerCase().replaceAll(pattern,""));
		return seq.toString().equals(seq.reverse().toString());
	}
}
