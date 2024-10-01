package com.Rough;

class One implements Runnable{
	
	int k=0;
	@Override
	synchronized public void run() {
		k++;
		System.out.println(Thread.currentThread().getName());
		System.out.println(k);
	}
}
class two implements Runnable{
	
	@Override
	synchronized public void run() {
		new One().run();
		new Thread(new One(), "Thread2").start();
		new Thread(new One(), "Thread3").start();
		System.out.println("two");
	}
}

public class ThreadRunnable  {
	public static void main(String[] args) {
		new Thread(new two(), "Thread1").start();
	}
}
