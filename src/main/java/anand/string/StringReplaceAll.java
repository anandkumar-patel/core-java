package anand.string;


public class StringReplaceAll {

	public static void main(String[] args) {
		
		String sText = "anand     is here for learning..           ...";
		String result = sText.replaceAll("\\s+", "");
		System.out.println("Original : "+sText);
		System.out.println("Result : "+result);
		System.out.println("===================( * )============================");
		
		System.out.println("===============================================");
		

	}

}
