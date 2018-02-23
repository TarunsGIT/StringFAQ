package in.co.sentence_reverse;

public class Sentence_Reverse {

	public static void main(String[] args) {
		String str = "This is someting";
		String arr[];
		arr = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(" " + arr[i]);

		}
	}

}
