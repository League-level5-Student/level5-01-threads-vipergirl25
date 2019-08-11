package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread [] myThreads;
	ConcurrentLinkedQueue<Task> taskQueue;
	public ThreadPool (int TotalThreads){
		myThreads = new Thread[TotalThreads];
		taskQueue = new ConcurrentLinkedQueue<Task>();
		for (int i = 0; i < myThreads.length; i++) {
			myThreads[i] = new Thread(new Worker(taskQueue));
		}
	
		
	}
	void addTask(Task task) {
		taskQueue.add(task);
	}
	void start() {
		for (Thread thread : myThreads) {
			System.out.println(thread.toString());
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
