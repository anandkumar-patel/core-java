package anand.enumeration;

public enum ColorEnum {
	RED, BLUE, GREEN, PURPLE, VIOLET, PINK, BLACK;

	public static void main(String[] args) {
		System.out.println(ColorEnum.RED);
		System.out.println(ColorEnum.valueOf("BLUE"));

		ColorEnum arr[] = ColorEnum.values();
		for (ColorEnum col : arr) {
			System.out.println(col + " at index " + col.ordinal());
		}

	}
}
