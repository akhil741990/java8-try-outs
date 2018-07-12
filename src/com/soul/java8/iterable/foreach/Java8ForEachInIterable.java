package com.soul.java8.iterable.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachInIterable {


	public static void main(String args[]) {
			List<Integer> l = new ArrayList<>();
			l.add(1);
			l.add(2);
			l.add(3);
			
			l.forEach(new Consumer<Integer>() {

				@Override
				public void accept(Integer t) {
					System.out.println("Consumed via annonymous class :"+ t);
					
				}
			});
			MyListConsumer consumer = new MyListConsumer();
			l.forEach(consumer);
	}
	
	static class MyListConsumer implements Consumer<Integer> {

		@Override
		public void accept(Integer t) {
			System.out.println("Consumed :"+ t);
		}
		
	}
}
