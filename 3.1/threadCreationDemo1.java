package com.thread;

public class threadCreationDemo1 extends Thread {
      public void run() {
			System.out.println("Concurrently thread started running");
		}
		public static void main(String[] args) {
			threadCreationDemo1 th=new threadCreationDemo1();
			th.start();
	}
	}

