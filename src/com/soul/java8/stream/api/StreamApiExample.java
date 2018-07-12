package com.soul.java8.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExample {


	public static void main(String args[]) {
		List<Integer> numList = new ArrayList<>();
		for(int i = 0 ;i < 100 ;i ++) {
			numList.add(i);
		}
		
		
		Stream<Integer> seqStream = numList.stream();
		Stream<Integer> parallelStream = numList.parallelStream();
		
		
		Stream<Integer> greaterThan90 = parallelStream.filter(n -> n >90);
	
		greaterThan90.forEach(n -> System.out.println("Num parllel :"+n));
		
		
		Stream<Integer> greaterThan90Seq = seqStream.filter(n -> n > 90);
		
		greaterThan90Seq.forEach(n -> System.out.println("Number Seq :"+n));
		
	}
	
}
