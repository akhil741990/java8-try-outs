package com.soul.java8.functionalinterface;

public class LambdaExpressionExample {

	public static void main(String args[]) {
		
		new Thread(()->
		{
			System.out.println("Thread started via lambda exp");
		}).start(); 
	}
}
// here we  r assigning lambda exp to a functional interface
// https://www.infoq.com/articles/Java-8-Lambdas-A-Peek-Under-the-Hood