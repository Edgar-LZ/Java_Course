package anagrama;

import java.util.HashMap;
import java.util.Map;

public class Anagram {


	public boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str1.toLowerCase().toCharArray();
		for(char c: arr1 ) {
			if(map1.get(c)== null)
				map1.put(c,0);
			map1.replace(c, map1.get(c)+1);
		}
		for(char c: arr2 ) {
			if(map2.get(c)== null)
				map2.put(c,0);
			map2.replace(c, map2.get(c)+1);
		}
		if(map1.equals(map2))
			return true;
		return false;
		
	}
	
}
