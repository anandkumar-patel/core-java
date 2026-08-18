package anand.exception.override;

import java.io.IOException;

public class ParentClass {

	public void method1() throws IOException{
		System.out.println("parent throws IOException");
	}
	
	public void method2() throws NullPointerException{
		System.out.println("parent throws NullPointerException");
	}
	
	public void method3() throws Exception{
		System.out.println("parent throws Exception");
	}
	
	public void method4() throws RuntimeException{
		System.out.println("parent throws RuntimeException");
	}
	
}
