package predicatedemo;

import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collectors;


public class Test {
	public static void main(String[]args)
	{
		product p1=new product("milk",55,25000);
		product p2=new product("choclate",33,15000);
		product p3=new product("fruit",67,3000);
		product p4=new product("eggs",88,987);
		
		List<product>s=Arrays.asList(p1,p2,p3,p4);
		List<product>ss=s.stream().filter(t->(t.getPrice()>10000)).toList();
		System.out.println(ss);
	}

}
