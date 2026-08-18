package anand.enumeration;

public class EnumDemo04 {
	
	public static void main(String args[]) {
		EnumThread thread = EnumThread.ONE;
		thread.run();
		thread = EnumThread.TWO;
		thread.run();
		thread = EnumThread.THREE;
		thread.run();		
	}

	private enum EnumThread implements Runnable {
		ONE {
			@Override
			public void run() {
				System.out.println("ONE");
			}
		},
		TWO {
			@Override
			public void run() {
				System.out.println("TWO");
			}
		},
		THREE;
		@Override
		public void run() {
			System.out.println("Default");
		}
	}
}
