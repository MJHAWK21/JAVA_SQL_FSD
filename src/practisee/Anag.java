package practisee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anag {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the strings");
	   String word1=sc.next();
	   String word2=sc.next();
	   System.out.println(isAnagram(word1,word2));
	}

	public static Boolean isAnagram(String word1, String word2){
	    List<String> listWord1 = new ArrayList<>(Arrays.asList(word1.split("")));
	    List<String> listWord2 = new ArrayList<>(Arrays.asList(word2.split("")));
	    
	    Collections.sort(listWord1);
	    Collections.sort(listWord2);
	    
	    word1 = String.join("", listWord1);
	    word2 = String.join("", listWord2);
	    
	    //return listWord1.equals(listWord2);
	    return word1.equals(word2);
	    //return word1 == word2 ; // not working because == tests for reference equality
	}


}
