package anand.util.map.custom;

public class MainMethod {
	public static void main(String[] args) {
		CustomHashMap<String, String> map = new CustomHashMap<String, String>();
		System.out.println("size : "+map.getSize());
		map.put("anand", "CSE");
		map.put("kumar", "ME");
		System.out.println("size : "+map.getSize()+" get value for key"+map.get("anand"));
		
	}

}
