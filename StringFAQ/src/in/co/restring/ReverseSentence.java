package in.co.restring;

public class ReverseSentence {

	static public void reverse(String str) {

		String arr[] = str.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(" " + arr[i]);
		}

	}

	public static void main(String[] args) {

		ReverseSentence.reverse("You will be evicted");

	}

}
