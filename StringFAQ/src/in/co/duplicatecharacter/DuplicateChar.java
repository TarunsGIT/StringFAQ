package in.co.duplicatecharacter;

public class DuplicateChar {

	public static void main(String[] args) {
		String str = "taarun";

		int[] ar = new int[256];
		for (int i = 0; i < str.length(); i++) {
			ar[str.charAt(i)] = ar[str.charAt(i)] + 1;
		}
		for (int i = 0; i < 256; i++) {
			char ch = (char) i;
			if (ar[i] > 0) {
				if (ar[i] == 1) {
					System.out.print(ch);
				} else {
					System.out.println(ch + "" + ar[i]);
				}
			}
		}

	}

}
