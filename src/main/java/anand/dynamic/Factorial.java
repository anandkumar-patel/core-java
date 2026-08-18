package anand.dynamic;

public class Factorial {
	public static void main(String[] args) {
		Factorial obj= new Factorial();
		System.out.println(obj.factorialByTailRecursion(4,1));
		System.out.println(obj.factorialByNonTailRecursion(5));
	}

	/*
	 * A tail recursive function to calculate factorial
	 */
	int factorialByTailRecursion(int number, int result)
    {
        if (number == 0) 
            return result;     
        return factorialByTailRecursion(number - 1, number * result);
    }
	
	/*
	 * A non tail recursive function to calculate factorial
	 */
	int factorialByNonTailRecursion(int number)
    {
        if (number == 0) 
            return 1;     
        return number*factorialByNonTailRecursion(number - 1);
    }
}

/*----------------------NOTE----------------------
* We have to check for negative before calling the method
* 
* And for recursive we pass 1 as second parameter because least value of any factorial is 1 
*
*
* ????????????????   What is tail recursion? 
* A recursive function is tail recursive when recursive call is the last thing executed by the function.
*
*The idea used by compilers to optimize tail-recursive functions is simple, since the recursive call is 
*the last statement, there is nothing left to do in the current function, so saving the current 
*function’s stack frame is of no use
*
*/
