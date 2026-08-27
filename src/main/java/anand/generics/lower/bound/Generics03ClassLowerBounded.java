package anand.generics.lower.bound;

import java.util.Arrays;
import java.util.List;

public class Generics03ClassLowerBounded<T> {
	public void addNumbers(List<? super T> list, T element) {
        list.add(element);
    }
}

