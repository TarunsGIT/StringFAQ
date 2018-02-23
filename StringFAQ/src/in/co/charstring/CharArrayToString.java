package in.co.charstring;

public class CharArrayToString {
	public static void main(String[] args) {
		char[] arr = { 'A', 'B', 'C' };
		String s = new String(arr);
		System.out.println(s);
		System.out.println("Was it a bee or a bat I saw?".substring(9, 12));

		final String str1 = "social";
		final String str2 = "media";
		String str3 = str1 + str2;
		String str4 = "socialmedia";
		System.out.println(str4);
		System.out.println(str3 == str4); // Output

		String str = "abcdefcghic";
		System.out.println(str.replaceAll(Character.toString('c'), ""));

		String word = "abcde";
		char ar[] = word.toCharArray();
		for (int i = 0; i < 4; i += 2) {
			System.out.println(i);
			System.out.print(ar[i]);
		}

		String Str1 = " Java ";
		String Str2 = " is ";
		String Str3 = " awesome .";
		String StrResult = Str1.trim() + Str2 + Str3.trim();
		System.out.println(StrResult);
		
		String Java = "Are you a Java expert? Yes, you are.";
		System.out.println(Java.length());
	}

}
