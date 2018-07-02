package com.soul.java8.functionalinterface;

public class Java7FunctionalInterfaceHistory {

	public static void main(String args[]) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("New Thread Started");
				
			}
		}).start();
	}
}
