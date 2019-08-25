package _03_Threaded_Reverse_Greeting;


public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	/* HINT: You will most likely need to do this with recursion */
	public static void main(String[] args) {
		try {
			createThread(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void createThread(int times) throws InterruptedException {
		if(times<=1) {
			System.out.println("I am thread " + times);
		}else if(times<=50){
			Thread thread1 = new Thread(()->System.out.println("i am thread " + times));
			
			thread1.start();
			Thread.sleep(100);
			createThread(times-1);
			
			
		
	
}

	

}
}