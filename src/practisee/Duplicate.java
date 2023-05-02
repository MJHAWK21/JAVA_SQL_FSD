package practisee;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
	public static String removedup(String str) {
		Set<Character>set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			Character c= str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}
		}
		return sf.toString();
	}
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter str");
		String str=in.next();
		System.out.println(removedup(str));
		
	}

}
