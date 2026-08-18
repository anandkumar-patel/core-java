package anand.exception;

import java.util.concurrent.TimeUnit;

public class FinallyBlockDemo implements Runnable{
   public void run(){
       System.out.println("Starting thread");
       try {
           TimeUnit.SECONDS.sleep(2);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       finally{
           System.out.println("inside finally");
       }
   }
   public static void main(String[] args)throws Exception {
       Thread t = new Thread(new FinallyBlockDemo());
       t.setDaemon(true);
       t.start();
       //Main thread will sleep
       Thread.sleep(1000);
   }
}


/*
OutPut:
Starting thread
Here if you comment the line  t.setDaemon(true);
Then the finally block will be executed.
Here the sleep time of the main thread is 1 sec(1000milisec). 
If you will make it 5 second then you can see the finally block of 
the daemon thread will be executed.

POINT:
When a thread is set to be a daemon thread then the finally block 
may not be executed. If it get sufficient time that other threads(non-daemon) 
are executing then it will execute the finally block.
*/
