package anand.util.stack;


public class CustomStackDemo {
	protected Object[] stk; 	// Stack
	protected int size; 			// Stack Size
	protected int stackCounter; 			// Stack Counter

	public CustomStackDemo(int initialCapacity) {
		if (initialCapacity < 1)
			throw new IllegalArgumentException("initialCapacity must be >= 1");

		stk = new Object[initialCapacity];
		size = initialCapacity;
		stackCounter = 0;
	}

	public CustomStackDemo() {
		stk = null;
		size = stackCounter = 0;
	}

	public void create(int initialCapacity) {
		if (initialCapacity < 1)
			throw new IllegalArgumentException("initialCapacity must be >= 1");

		stk = new Object[initialCapacity];
		size = initialCapacity;
		stackCounter = 0;
	}

	public boolean isfull() {
		return (stackCounter == size);
	}

	public boolean isempty() {
		return (stackCounter == 0);
	}

	public Object[] update() {

		return stk;
	}

	public boolean push(Object element) {
		if (stackCounter == size)
			return false;

		stk[stackCounter] = element;
		stackCounter++;

		return true;
	}

	public Object pop() {
		if (stackCounter == 0)
			return false;

		stackCounter--;
		return stk[stackCounter];
	}

	public String toString() {
		int i;
		StringBuffer s = new StringBuffer("[");

		for (i = 0; i < stackCounter; i++)
			s.append(stk[i].toString() + ", ");

		for (; i < size; i++)
			s.append("__, ");

		if (size > 0)
			s.delete(s.length() - 2, s.length());

		s.append("]");
		return new String(s);
	}

	public String getStatus() {
		StringBuffer s = new StringBuffer("");
		s.append("Stack Counter : " + stackCounter);
		return new String(s);
	}
}
