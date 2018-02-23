package in.co.restring;

public class StrIntern {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = new String("abc");
		s2.intern();

		System.out.println(s1 == s2);

		s2 = s2.intern();

		System.out.println(s1 == s2);
       
		System.out.println(s2 == s3);

	}

}
