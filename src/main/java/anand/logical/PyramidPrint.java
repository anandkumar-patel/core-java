package anand.logical;

import java.util.Collections;

public class PyramidPrint {

	public static void main(String[] args) {
		printHalfPyramid(5);
		printFullPyramid(5);
		printFullDensPyramidJava8(5);
		printReversePyramidJava8(5);
	}
	
	
	public static void printHalfPyramid(int len) {
		System.out.println("Half Pyramid :");
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void printFullPyramid(int len) {
		System.out.println("Full Pyramid :");
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
			System.out.println();
		}
	}
	
	
	public static void printFullDensPyramidJava8(int len) {
		System.out.println("Full Pyramid (Compact) :");
		for (int i = 0; i < len; i++) {
			System.out.println(String.join("", Collections.nCopies(5 - i - 1, " "))
					+ String.join("", Collections.nCopies(2 * i + 1, "*")));
		}
	}
	
	public static void printReversePyramidJava8(int len) {
		System.out.println("Inverted Pyramid :");
        for (int i = len; i > 0; i--) {
            System.out.println(String.join("", Collections.nCopies(5 - i, " "))
                    + String.join("", Collections.nCopies(2 * i - 1, "*")));
        }
	}

}

