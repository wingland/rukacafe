package com.rukacafe.base.concurrency;

public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread simplethread=new Thread();
		simplethread.start();
		MyThread mythread=new MyThread();
		mythread.start();
		Thread thread=new Thread(){
			public void run(){
				System.out.println("Thread Running");
			}
		};
		thread.start();
		Thread threadB = new Thread(new Myrunnable());
		threadB.start();
		
		Thread threadc=new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable Running o");
				// TODO Auto-generated method stub
				
			}
		});
		threadc.start();
		// TODO Auto-generated method stub

	}

}
