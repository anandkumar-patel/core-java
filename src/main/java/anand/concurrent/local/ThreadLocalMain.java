package anand.concurrent.local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThreadLocalMain {
	public static void main(String[] args) {
		for(int i =0;i<100;i++) {
			new Thread() {
				@Override
				public void run() {
					String dob = new UserService().getbirthDate(1);
					System.out.println(dob + " for id : " + Thread.currentThread().threadId());
				};
			}.start();
		}
	}	
}

class UserService {
	
	public String getbirthDate(int id) {
		LocalDate dob = LocalDate.now();
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yyy/MM/dd");
		return dob.format(myFormatter);		
	}
}