package anand.string;

public class AddNumber {

	public static void main(String[] args) {
		AddNumber obj= new AddNumber();
		String input="here use 5 come after 6 and 3 comes before 4";
		//int output=obj.addAllNumbers(input);
		int output=obj.bestWay(input);
		System.out.println("Result is  :"+output);		
	}
public int addAllNumbers(String input)
{
	int a=0;
	String []arrdata=input.split(" ");
	for(int i=0;i<arrdata.length;i++)
	{
		try {
			a=a+Integer.parseInt(arrdata[i]);
			
		} catch (NumberFormatException e) {
			continue;
		}
	}
	return a;
}
public int bestWay(String input)
{
	String arr[] = input.trim().split("[ a-zA-Z]+"); // Please note a space is there after Z
	
    int sum = 0;
    System.out.println(arr.length);
    for (int i = 0; i < arr.length; i++)
    {
        sum += Integer.parseInt(arr[i]);
    	System.out.println(arr[i]);
    }
	return sum;
}
}
