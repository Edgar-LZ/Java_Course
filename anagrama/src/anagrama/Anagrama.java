package anagrama;

public class Anagrama {

	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		System.out.println(anagram.isAnagram("torpes  ","postre"));
		System.out.println(anagram.isAnagram("aparta","raptar"));
	}
	
}
