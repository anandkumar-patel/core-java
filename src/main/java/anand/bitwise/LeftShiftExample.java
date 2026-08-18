package anand.bitwise;

public class LeftShiftExample {
    public static void main(String[] args) {
        int num = 10;  // Binary representation: 0000 1010
        
        // Left shifting the bits of 'num' by 2 positions
        int result = num << 2;  // Shifting 'num' left by 2 positions
        
        // Binary representation of result after left shift: 0010 1000
        System.out.println("Original number (in decimal): " + num);
        System.out.println("Original number (in binary): " + Integer.toBinaryString(num));
        System.out.println("Result after left shift by 2 positions (in decimal): " + result);
        System.out.println("Result after left shift by 2 positions (in binary): " + Integer.toBinaryString(result));
    }
}
