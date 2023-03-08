package predicatedemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenpat {
	public static void main(String[]args) {
		List<Integer>s=Arrays.asList(4,7,64,23,50);
		List<Integer>pattern=s.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
	    System.out.println(pattern);

	}
}
