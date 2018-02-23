package in.co.removeduplicatecharacter;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		String s = "Infosys Limited";
		System.out.println(s);
		LinkedHashSet<Character> L = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			L.add(s.charAt(i));

		}

		Iterator<Character> it = L.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
