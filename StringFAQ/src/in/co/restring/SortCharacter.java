package in.co.restring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCharacter {

	public static void main(String[] args) {
		String str = "Tarun";
		char arr[];

		List<Character> L = new ArrayList<Character>();

		for (int i = 0; i < str.length(); i++) {
			arr = str.trim().toLowerCase().toCharArray();
			L.add(arr[i]);
		}

		Collections.sort(L);

		str = L.toString();
		str = str.replaceAll("\\[", "").replaceAll("\\]", "")
				.replaceAll(",", "");

		System.out.println(str.trim());

	}

}
