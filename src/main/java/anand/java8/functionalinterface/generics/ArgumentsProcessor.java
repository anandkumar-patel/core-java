package anand.java8.functionalinterface.generics;

@FunctionalInterface
public interface ArgumentsProcessor<X extends Number> {
	X process(X x1, X x2);
}
