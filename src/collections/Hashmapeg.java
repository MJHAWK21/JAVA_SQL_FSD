package collections;

import java.util.HashMap;

public class Hashmapeg {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap();
		map.put("Alice", 34);
		map.put("jenny", 25);
		map.put("urmila", 56);
		int hashCode=map.hashCode();
		System.out.println("the hashcode is"+hashCode);
		int age=map.get("Alice");
		System.out.println("Age of Alice:"+age);
		boolean containsA=map.containsKey("june");
		System.out.println("hashmap contains june:"+containsA);
		map.remove("urmila");
		System.out.println("urmila has neen removed");
		for(String name:map.keySet()) {
			int value=map.get(name);
			System.out.println(name+"is"+value+"years old");
		}
	}

}
