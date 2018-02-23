package in.co.longeststringinarraylist;

import java.util.ArrayList;

public class LongestStringInArrayList {
	public static void main(String[] args) {
		ArrayList<String> L = new ArrayList<String>();
		String SLong = null;
		L.add("OMR");
		L.add("OMG");
		L.add("LDAP");
		L.add("JASMINE");
		L.add("POPOYE");
		int Longest = L.get(0).length();
		for (int i = 0; i < L.size(); i++) {
			if (Longest < L.get(i).length()) {
				Longest = L.get(i).length();

				if (L.get(i).length() == Longest) {
					SLong = L.get(i);
				}

			}

		}
		System.out.println(SLong + " " + Longest);
	}
}
