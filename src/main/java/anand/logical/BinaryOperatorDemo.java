package anand.logical;

public class BinaryOperatorDemo {

  public static void main(String[] args) {

    int a =10;
    int b = -27;
    int c = -118;
    
   System.out.println(a | b);
   System.out.println(Integer.toBinaryString(c));
  }

}

/*
Converting decimal to binary:
	-for positive number just convert to binary
	-for negative number
		- first convert to binary of absolute number
		- then take 1st complement (reverse the binary digits)
		- then take 2nd complement(add 1 to lsb)
converting binary to decimal:
	-for positive number just convert simply
	-for negative number msb will be 1 that means (-1)*2^8 for 8 bit signed integer.
	
	Example : 00001010 = 0*2^7 + 0*2^6 + 0*2^5 + 0*2^4 + 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 8 +2 = 10
	Example : 10001010 = (-1)*2^7 + 0*2^6 + 0*2^5 + 0*2^4 + 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 =-128+ 8 +2 = -118
	
*/
