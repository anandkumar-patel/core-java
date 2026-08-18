package anand.mathematical;

public class IsumberEven {

    
    public static void main(String[] args) {
       
    	IsumberEven ie = new IsumberEven();
        System.out.println("Using Method 1");
            ie.isEvenM1(5);
            ie.isEvenM1(6);
        System.out.println("Using Method 2");
            ie.isEvenM2(5);
            ie.isEvenM2(6);
        System.out.println("Using Method 3");
            ie.isEvenM3(5);
            ie.isEvenM3(6);
        System.out.println("Using Method 4");
            ie.isEvenM4(5);
            ie.isEvenM4(6);
    }

    private void isEvenM4(int i) {
        int res = (i >> 1) << 1; // right by 1 bit and then left shift by 1 bit
        if(res == i) {
            System.out.println(i +" is Even Number");
        } else {
            System.out.println(i + " is Not Even Number");
        }
       
    }

    private void isEvenM3(int i) {
       
        int res = i & 1;
       
        if(res == 0) {
            System.out.println(i +" is Even Number");
        } else {
            System.out.println(i + " is Not Even Number");
        }
    }

    private void isEvenM2(int i) {
       
        if((i/2) * 2 == i) {
            System.out.println(i +" is Even Number");
        } else {
            System.out.println(i + " is Not Even Number");
        }
       
    }

    private void isEvenM1(int i) {
       
        int rem = i % 2;
       
        if(rem == 0) {
            System.out.println(i +" is Even Number");
        } else {
            System.out.println(i + " is Not Even Number");
        }
       
    }

}
