package in.co.charactercount;

import java.util.HashMap;

public class CharacterCountInString {
	public static void main(String[] args) {
		String s = "Infosys Limited";
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = s.toLowerCase().toCharArray();
		System.out.println(s.length());

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
				System.out.println(charCountMap.get(c) + 1);

			} else {
				charCountMap.put(c, 1);
			}

		}
		System.out.println(charCountMap);

	}

}
