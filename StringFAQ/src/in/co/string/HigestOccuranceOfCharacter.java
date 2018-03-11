package in.co.string;

public class HigestOccuranceOfCharacter {

	private static final int ASCI = 256;

	public static void main(String[] args) {

		int count[] = new int[ASCI];
		String str = "Limited";

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;

		}
		int max_count = -1;
		char result = ' ';
		
		for(int i=0;i<str.length();i++){
			if(max_count<count[str.charAt(i)]){
				max_count=count[str.charAt(i)];
				result=str.charAt(i);
				
			}
			
		}
		System.out.println(result);

	}
}
