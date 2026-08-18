POINT -1 :
If method returns a value and also has try, catch and finally blocks in it,
then following two rules need to be followed.
	i) If finally block returns a value then try and catch blocks may or may not return a value.
	ii) If finally block does not return a value then both try and catch blocks must return a value.
	
POINT -2 :
If try-catch-finally blocks are returning a value according to above rules, then you should not keep
any statements after finally block. Because they become unreachable and in Java,Unreachable code 
gives a compile time error.

POINT -3 :(Method Overriding With throws Clause)
	i)	If super class method is not throwing any exceptions, then it can be overridden with any
	unchecked type of exceptions, but can not be overridden with checked type of exceptions.
	
	ii) If a superclass method is throwing unchecked exception, then it can be overridden in the
	sub class with same exception or any other unchecked exceptions but
	can not be overridden with checked exceptions.
	
	iii) If super class method is throwing checked type of exception, then it can be overridden
	with same exception or with it’s sub class exceptions i.e you can decrease the scope of
	the exception, but can not be overridden with it’s super class exceptions
	i.e you can not increase the scope of the exception.
	
	
POINT -4 : Chained Exceptions (Example : ChainedException.java)
	Chained Exceptions allows to relate one exception with another exception,
	i.e one exception describes the cause of another exception. For example,
	consider a situation in which a method throws an ArithmeticException because of an
	attempt to divide by zero but the actual cause of exception was an I/O error which caused
	the divisor to be zero. The method will throw only ArithmeticException to the caller.
	So the caller would not come to know about the actual cause of exception.
	Chained Exception is used in such situations.
	Constructors Of Throwable class Which support chained exceptions in java :
	Throwable(Throwable cause) :- Where cause is the exception that causes the current exception.
	Throwable(String msg, Throwable cause) :- Where msg is the exception message and cause is the
	exception that causes the current exception.
	Methods Of Throwable class Which support chained exceptions in java :
	getCause() method :- This method returns the actual cause of an exception.
	initCause(Throwable cause) method :- This method sets the cause for the calling exception.

POINT -5 :(final keyword points)
	i) If the global variables are not initialized explicitly, they get default value at the
	time of object creation. But final global variables don’t get default value and they must
	be explicitly initialized at the time of object creation.
	Uninitialized final field is called Blank Final Field.
	ii)  final non-static global variable must be initialized at the time of declaration or
	in all constructors or in any one of IIBs – Instance Initialization Blocks.
	
	iii) final static global variable must be initialized at the time of declaration or in any
	one of SIBs – Static Initialization Blocks.
	(final static global variable can’t be initialized in constructors)
	

