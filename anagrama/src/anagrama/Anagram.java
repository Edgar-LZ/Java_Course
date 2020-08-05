package anagrama;

import java.util.Arrays;

public class Anagram {


	public boolean isAnagram(String str1, String str2) {
		char[] charsWord1 = str1.replaceAll("[^A-Za-z]", "").toLowerCase().toCharArray();;
		char[] charsWord2 = str2.replaceAll("[^A-Za-z]", "").toLowerCase().toCharArray();

		if(charsWord1.length != charsWord2.length)
			return false;

		int[] countChars1 = new int['z'-'a'+1];//+1 Incluye la letra ñ
		int[] countChars2 = new int['z'-'a'+1];
		for(int i=0;i < charsWord1.length;i++) {
			if(charsWord1[i] == 'ñ')
				countChars1[-1]++;
			else
				countChars1[charsWord1[i]-'a']++;
			if(charsWord1[i] == 'ñ')
				countChars2[-1]++;
			else
				countChars2[charsWord2[i]-'a']++;
		}
		return Arrays.equals(countChars1, countChars2);
	}
	
}
