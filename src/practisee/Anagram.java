package practisee;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean isAnagram(String str1,String str2)
	{
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char[] str11=str1.toCharArray();
		char[]str21=str2.toCharArray();
		
		Arrays.sort(str11); 
		Arrays.sort(str21);
		
		boolean result= Arrays.equals(str11,str21);
		return result;
	}
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter ther strings");
		String str1=in.next();
		String str2=in.next();
		System.out.println("THE STRINGS are anagrams:"+isAnagram(str1,str2));
	}

}
