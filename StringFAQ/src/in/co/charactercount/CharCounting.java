package in.co.charactercount;

import java.util.HashMap;

public class CharCounting {
	public static void main(String[] args) {
		String s = "Capgemini";
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] arr = s.toLowerCase().toCharArray();

		for (char c : arr) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}

		}
		System.out.println(charCountMap);

	}

}
