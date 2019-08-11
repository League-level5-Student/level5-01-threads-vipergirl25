package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> mylist;
	public Worker(ConcurrentLinkedQueue<Task> taskQueue){
		mylist = taskQueue;
	}
	@Override
	public void run() {
		if (mylist.isEmpty()==false) {
			mylist.remove().perform();
		}

	}


}
