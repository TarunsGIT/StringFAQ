package in.co.intern;

public class Intern {

	public static void main(String[] args) {
		String s1 = "abc";// SLP
		String s2 = new String("abc");// HEAP
		System.out.println(s1 == s2);
		s2.intern();
		System.out.println(s1 == s2);
		s2 = s2.intern();
		System.out.println(s1 == s2);
		System.out.println(Integer.parseInt("10"));

		// 1
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = s1;
		System.out.println(s1 == s3);

	}

}
