package org.pankaj.client;

import org.pankaj.threads.MyThread;

public class Client {
public static void main(String[] args) throws InterruptedException {
	while(true)
	{
	MyThread obj=new MyThread();
	Thread thread =new Thread(obj);
	thread.run();
	thread.join();
	}
	
}
}

