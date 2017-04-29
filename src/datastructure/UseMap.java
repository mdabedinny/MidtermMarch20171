package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> student = new ArrayList<String>();
		student.add("A");
		student.add("B");
		student.add("c");
		student.add("D");
		student.add("E");

		List<String> teacher = new ArrayList<String>();
		teacher.add("V");
		teacher.add("w");
		teacher.add("X");
		teacher.add("Y");
		teacher.add("Z");

		List<String> parents = new ArrayList<String>();
		parents.add("Korim");
		parents.add("Rohim");
		parents.add("Shahin");
		parents.add("Shamim");
		parents.add("Topu");

		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		map.put("st", student);
		map.put("th", teacher);
		map.put("pa", parents);
		for(Map.Entry<String, List<String>> aMap:map.entrySet()){
			System.out.println(aMap.getKey()+":"+aMap.getValue());
		}


	}
}
