package anand.dynamic;

public class TriangleCheck {

	public static void main(String[] args) {
		TriangleCheck obj = new TriangleCheck();
		int arr[] = {3,3,10};
		String trinale = obj.triangleType(arr);
		System.out.println("Tringle type is :"+trinale);
	}
	public String triangleType(int []arr){
		int x = arr[0];
		int y= arr[1];
		int z = arr[2];
		if((x<=0) || (y<=0) || (z<=0)) {
			return "This is not a triangle";
		} else {
			if((x + y <= z) || (x + z <= y) || (y + z <= x)) {
				return "This is not a triangle";
			} else {

				if( ((x * x) + (y * y) == (z * z)) || ((x * x) + (z * z) == (y * y)) || ((z * z) + (y * y) == (x * x)) ) {
					return "right-angled";
				} else if( ( ((x * x) + (y * y) < (z * z)) || ((x * x) + (z * z) < (y * y)) || ((z * z) + (y * y) < (x * x)) ) || ( ( x<=z && y<=z ) || ( x<=y && z<=y ) || ( y<=x && z<=x ) ) ) {
					return "acute-angled";
				} else if( ( ((x * x) + (y * y) > (z * z)) || ((x * x) + (z * z) > (y * y)) || ((z * z) + (y * y) > (x * x)) ) || ( ( x>z && y>z ) || ( x>y && z>y ) || ( y>x && z>x ) ) ) {
					return "obtuse-angled";
				} else {
					return "Not a triangle";
				}

			}
		}
	}
	public String triangleType1(int []arr){
		int x = arr[0];
		int y= arr[1];
		int z = arr[2];
		if((x<=0) || (y<=0) || (z<=0)) {
			return "This is not a triangle";
		} else {
			
			if((x + y <= z) || (x + z <= y) || (y + z <= x)) {
				return "This is not a triangle";
			} else {

				if( ((x * x) + (y * y) == (z * z)) || ((x * x) + (z * z) == (y * y)) || ((z * z) + (y * y) == (x * x)) ) {
					return "right-angled";
				} else if( ( ((x * x) + (y * y) < (z * z)) || ((x * x) + (z * z) < (y * y)) || ((z * z) + (y * y) < (x * x)) ) || ( ( x<=z && y<=z ) || ( x<=y && z<=y ) || ( y<=x && z<=x ) ) ) {
					return "acute-angled";
				} else if( ( ((x * x) + (y * y) > (z * z)) || ((x * x) + (z * z) > (y * y)) || ((z * z) + (y * y) > (x * x)) ) || ( ( x>z && y>z ) || ( x>y && z>y ) || ( y>x && z>x ) ) ) {
					return "obtuse-angled";
				} else {
					return "Not a triangle";
				}

			}
		}
	}
}
