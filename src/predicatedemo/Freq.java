package predicatedemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Freq {
	String name;

	public Freq(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[]args) {
		
		List<String>n=Arrays.asList("kochi","pathanamthita","kochi","Tvm","banglore","Madras","Tvm");
		Map<String, Long>dupe=n.stream().map(t->t.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(dupe);
		
		
	}

}
