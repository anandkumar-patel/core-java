package anand.tests.hackerrank;
/**
 * Find the character count of {chr} in given string {input} of length {len}.
 * EXAMPLE :
 * Find charcater 'a' in string  "abcac" of length 12. 
 * ie. find 'a' count in string "[abcac][abcac][ab]"
 * @author anandpatel
 *
 */
public class RepeatedStringCount {

	public static void main(String[] args) {

		RepeatedStringCount obj = new RepeatedStringCount();
		String input = "abcac";		
		char chr = 'a';
		int len =10;
		System.out.println("repeated count : "+obj.repeatedString(input, len, chr));
		
		

	}
	
	public static long repeatedString(String inputStr, long length, char chr) {
		long repeatedCount = length / sizeOfInputString(inputStr);
		long remChar = length % sizeOfInputString(inputStr);
		long charInInputCount = countCharInString(chr, inputStr.length(), inputStr);
		long totSize =0;
		totSize = charInInputCount*repeatedCount;
		if(remChar>0) {
			totSize +=countCharInString(chr, remChar, inputStr);
		}
		
		return totSize;
	}
	
	
	public static int sizeOfInputString(String input) {
		return input.length();
	}
	
	public static long countCharInString(char chr, long position, String input) {
		long count = 0;
		for (int i = 0; i < position; i++) {
			if (chr == input.charAt(i)) {
				count++;
			}
		}
		return count;
	}

}
