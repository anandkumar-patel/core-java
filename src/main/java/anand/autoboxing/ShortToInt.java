package anand.autoboxing;

public class ShortToInt {
	public static void main(String[] args) {
		short x = 1;
		x += 1;// No compilation error
		// uncomment it x=x+1;//Compilation error it should be-> x=(short)
		// (x+1);
		// x=(short)(x+1);
	}
}
