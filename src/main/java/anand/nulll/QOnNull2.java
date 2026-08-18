package anand.nulll;

public class QOnNull2
{
	public static void printMethod(String s)
	{
		System.out.println("String");
	}
	public static void printMethod(Object s)
	{
		System.out.println("Object");
	}
	public static void printMethod(Integer i)
	{
		System.out.println("Integer");
	}
	public static void main(String []args)
	{
		if(null==null)
			System.out.println("null==null");
		printMethod((String)null);
	}
}