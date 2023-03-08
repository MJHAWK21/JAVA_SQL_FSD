package predicatedemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class City {

	public static void main(String[] args) {
		List<String>s=Arrays.asList("kochi","haripur","meghalaya","herzegovina","holland","poland");
		List<String>city=s.stream().filter(a->a.startsWith("h")).collect(Collectors.toList());
		System.out.println(city);		
	}

}
