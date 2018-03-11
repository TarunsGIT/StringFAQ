package in.co.string;

public class RemoveFirstLastAndReverse {
	public static void main(String[] args) {
		String str = "GURU";
		String rstr = str.substring(1, str.length() - 1);
		String reverse = "";

		for (int i = rstr.length() - 1; i >= 0; i--) {
			reverse = reverse + rstr.charAt(i);
		}

		System.out.println(reverse);

	}
}