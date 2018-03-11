package in.co.patterncapital;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCapital {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String........");
		String str = in.nextLine();
		StringBuffer buffer = new StringBuffer();
		Matcher m = Pattern
				.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(
						str);
		while (m.find()) {
			m.appendReplacement(buffer, m.group(1).toUpperCase()
					+ m.group(2).toLowerCase());
		}
		System.out.println("Capital: " + m.appendTail(buffer).toString());
		in.close();

	}

}
