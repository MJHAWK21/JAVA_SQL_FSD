package practisee;


import java.util.Scanner;
import java.util.Arrays;


public class Anagramwithoutsorting {
	
	public static boolean isAnagaram(String str1,String str2) {
		
		char[]str11=str1.replaceAll("\\s","").toLowerCase().toCharArray();
		char[]str21=str2.replaceAll("\\s", "").toLowerCase().toCharArray();
		
		if(str11.length!=str21.length) {
			return false;
		}
	
		int[]frequencies=new int[26];
		for(int i=0;i<str11.length;i++) {
			frequencies[str11[i]-'a']++;
			frequencies[str21[i]-'a']--;
		}
			
			for(int frequency: frequencies) {
				if(frequency!=0) {
					return false;
			}

		}
		return true;
	}
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the strings");
		String str1=in.next();
		String str2=in.next();
		System.out.println("The anagrams are:"+isAnagaram(str1,str2));
		
	}

}
