package anand.dynamic;

public class BooleanDemo {
	public static void main(String[] args) {
		Boolean check=null;
		System.out.println("check value is :"+getData(3));
		
	}
	public static Boolean getData(int i){
		Boolean data=null;
		if(i==1)
			data=true;
		if(i==5)
			data=false;
		return data;

	}
}
