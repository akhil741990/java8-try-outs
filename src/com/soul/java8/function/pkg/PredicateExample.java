package com.soul.java8.function.pkg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String args[]) {
		List<String> stringList = Arrays.asList("abc", "acd","efgh");
		 
		Predicate<String> predicate = (str) -> str.startsWith("a");
		
		for(String str : stringList) {
			if(predicate.test(str)) {
				System.out.println("String starting with 'a'----->" + str);
			}else {
				System.out.println("String doesn't start with 'a'----->" + str);
			}
		}
		//Streams Filter and Collector
		stringList = stringList.stream().filter(s->s.startsWith("e")).collect(Collectors.toList());
		System.out.println("String starting with e");
		stringList.forEach(s-> System.out.println(s));
		
		
		System.out.println("String starting with e in converted to uppercase");
		//Stream map
		stringList = stringList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		stringList.forEach(s-> System.out.println(s));
	}
}
