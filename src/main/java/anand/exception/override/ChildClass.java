package anand.exception.override;

import java.io.IOException;

public class ChildClass extends ParentClass {
@Override
public void method1() throws IOException{
	System.out.println("parent throws IOException");
}

@Override
public void method2() throws NullPointerException{
	System.out.println("parent throws NullPointerException");
}

@Override
public void method3() throws Exception{
	System.out.println("parent throws Exception");
}

@Override
public void method4() throws RuntimeException{
	System.out.println("parent throws RuntimeException");
}
	
	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
	}

}
