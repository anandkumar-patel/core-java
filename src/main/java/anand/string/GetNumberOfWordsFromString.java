package anand.string;

/**
 * The Class GetNumberOfWordsFromString.
 * 
 * ???????How to truncate a string after n number of words?????
 */
public class GetNumberOfWordsFromString {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		GetNumberOfWordsFromString obj = new GetNumberOfWordsFromString();
		String text = "The quick brown fox jumps over the lazy dog.";

		String one = obj.truncateAfterWords(1, text);
		System.out.println("1 = " + one);

		String two = obj.truncateAfterWords(2, text);
		System.out.println("2 = " + two);

		String four = obj.truncateAfterWords(4, text);
		System.out.println("4 = " + four);
	}

	/**
	 * Truncate after words.
	 *
	 * @param numberOfWords the number of words
	 * @param longString the long string
	 * @return the string
	 */
	public String truncateAfterWords(int numberOfWords, String longString) {
		return null;
	}

}
