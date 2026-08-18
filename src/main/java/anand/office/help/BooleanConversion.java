package anand.office.help;

public class BooleanConversion {
	public static void main(String[] args) {
		String[] deletedItem ={"false","false","true","false","true"};
		for(int i=0; i<deletedItem.length; i++) {
			System.out.println(Boolean.parseBoolean(deletedItem[i]));
		}
	}

}
