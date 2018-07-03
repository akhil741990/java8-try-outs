package com.soul.java8.function.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

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
	}
}
