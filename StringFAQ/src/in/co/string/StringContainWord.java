package in.co.string;

public class StringContainWord {
	public static void main(String[] args) {
		String s = "dolphin";
		char c = 'l';
		StringBuffer restr = new StringBuffer(s.length());
		restr.setLength(s.length());
		int current = 0;
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (curr != c) {
				restr.setCharAt(current++, curr);
			}

		}
		System.out.println(restr.toString());

	
	}

}
