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
		
		// Reduce
		Integer result = numList.stream().filter(e -> e > 90).reduce(0, Integer::sum);
		
		System.out.println("Sum :" + result);
		
		//Joining 
		String joining = numList.stream().filter(x -> x > 90).map(x ->findById(x)).collect(Collectors.joining(" $ "));
		
		System.out.println("joining : " + joining);
		
		
		//Partition By
		
		Map<Boolean,List<Integer>> partition = numList.stream().collect(Collectors.partitioningBy(i -> i %10 ==0));
	
		partition.get(true).stream().forEach(x -> System.out.println(x));
		
		// Group By
		Map<Character, List<String>> group = numList.stream().map(x -> findById(x)).collect(Collectors.groupingBy(x -> new Character(x.charAt(x.length()-1))));
			
		group.entrySet().stream().forEach(x -> System.out.println(x.getKey() +" : " + x.getValue() ));
		
		Map<Integer, List<Integer>> test = numList.stream().collect(Collectors.groupingBy(x -> x%10));
	    test.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " : " + x.getValue() ));
		
	   //Mapping :  
	   /*
	    * Here’s how we can do that; we can use mapping() which can actually adapt the collector to a different type – using a mapping function:

@Test
public void whenStreamMapping_thenGetMap() {
    Map<Character, List<Integer>> idGroupedByAlphabet = empList.stream().collect(
      Collectors.groupingBy(e -> new Character(e.getName().charAt(0)),
        Collectors.mapping(Employee::getId, Collectors.toList())));

    assertEquals(idGroupedByAlphabet.get('B').get(0), new Integer(2));
    assertEquals(idGroupedByAlphabet.get('J').get(0), new Integer(1));
    assertEquals(idGroupedByAlphabet.get('M').get(0), new Integer(3));
}
Here mapping() maps the stream element Employee into just the employee id – which is an Integer – using the getId() mapping function. These ids are still grouped based on the initial character of employee first name.
	    * 
	    */
	  
	   //  https://stackify.com/streams-guide-java-8/
		
		
		
	}

	public static String findById(Integer id){
		return map.get(id);
	}
}
