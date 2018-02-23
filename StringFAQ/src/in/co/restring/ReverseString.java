package in.co.restring;

public class ReverseString {

	public String reverse(String str) {

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;

	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();

		System.out.println(rs.reverse("Tarun"));

	}

}
