package anand.interview;

import java.util.ArrayList;
import java.util.List;

public class DoubleBraceInitialization {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>() {
			{
				add("anand");
				add("patel");
			}
			{
				add("kumar");
			}
		};
		
		System.out.println(list);
	}

}
