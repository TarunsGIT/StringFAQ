package in.co.sentence_reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCharcterInString {

	public static void main(String[] args) {
		String str = "Tarun";
		char[] arr;

		List<Character> L = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			arr = str.toLowerCase().toCharArray();
			L.add(arr[i]);

		}
		Collections.sort(L);
		str = L.toString();
		System.out.println(str);
	    str = str.replaceAll("\\[", "").replaceAll("\\]", "")
				.replaceAll("[,]", "");
		System.out.println(str);

	}

}
