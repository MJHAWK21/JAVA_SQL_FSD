package predicatedemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class numsq{
	public static void main(String[]args) {
		List<Integer>s=Arrays.asList(24,76,2,3);
		List<Integer>power=s.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println(power);
		
	}
}