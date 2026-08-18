package anand.staticjava;


public class StaticVarInitialization {
	static final int istatic = 10;  
	// Since istatic is static final, it must be assigned value here only.
	
	final int i;  // i could be assigned a value here also
	StaticVarInitialization() {
	    i = 10;
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
