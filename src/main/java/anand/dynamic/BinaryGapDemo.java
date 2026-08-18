package anand.dynamic;

public class BinaryGapDemo {

	public static void main(String[] args) {
		BinaryGapDemo obj = new BinaryGapDemo();
		int number =65;
		int gap = obj.solution(number);
		System.out.println("Binaray gap in "+number+" is :" + gap);
	}

	public int solution(int number) {
		int zeroCount = 0;
        int maxCount = 0;
        String str = Integer.toBinaryString(number);
        System.out.println("Binary representation of "+number+" is : "+str);
        for (int i = 0; i < str.length() -1; i++)
        {
            if (str.charAt(i+1) =='0')
                zeroCount++;
            else {
                if (str.charAt(i) =='0')
                {
                    if (zeroCount > maxCount)
                    {
                        maxCount = zeroCount;
                    }
                    zeroCount = 0;
                }
            }
        }
        return maxCount;
	}
}

/*			---PROBLEM----
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is 
 * surrounded by ones at both ends in the binary representation of N.
 * 
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. 
 * The number 529 has binary representation 1000010001 and contains two binary gaps: 
 * one of length 4 and one of length 3. The number 20 has binary representation 10100 and 
 * contains one binary gap of length 1. The number 15 has binary representation 1111 and 
 * has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 */
