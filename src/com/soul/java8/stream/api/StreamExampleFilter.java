package com.soul.java8.stream.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExampleFilter {

	static Map<Integer,String> map = new HashMap<Integer, String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<Integer,String> map = new HashMap<Integer, String>();
		
		
		List<Integer> numList = new ArrayList<>();
		for(int i = 0 ;i < 100 ;i ++) {
			numList.add(i);
			map.put(i, "EMP_"+i);
		}
		
		List<String> names = numList.stream().filter(e -> e > 90).map(x ->findById(x)).collect(Collectors.toList());
		
		names.stream().forEach(x -> System.out.println(x));
		
		Integer result = numList.stream().filter(e -> e > 90).reduce(0, Integer::sum);
		
		System.out.print("Sum :" + result);
	}

	public static String findById(Integer id){
		return map.get(id);
	}
}
