package in.co.restring;

public class PalString {

	static public boolean Palindrome(String str) {

		boolean flag = true;

		char arr[];

		for (int i = 0; i < str.length(); i++) {

			arr = str.toLowerCase().toCharArray();
			if (arr[i] != arr[str.trim().length() - i - 1]) {
				flag = false;
				break;

			}

		}

		return flag;

	}

	public static void main(String[] args) {

		boolean result = PalString.Palindrome("Radar");

		if (!result) {
			System.out.println("Not Palindrome");
		} else {
			System.out.println("Palindrome");
		}

	}

}
