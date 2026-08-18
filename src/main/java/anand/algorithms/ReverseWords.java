package anand.algorithms;

public class ReverseWords {

	public static void main(String[] args) {
		String orgString = "Hello anand welcome to java";
		ReverseWords obj = new ReverseWords();

		String reversedString = obj.reverseSentence(orgString);

		System.out.println("Original String : " + orgString);
		System.out.println("Revered String : " + reversedString);
	}

	public String reverseSentence(String input) {
		StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        return result.toString();
	}

}
