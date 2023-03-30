package practisee;


import java.util.Scanner;
import java.lang.*;

public class Capital {
	public static String capitalizeWord(String str){  
	    String words []=str.split("\\s");  
	    String newWord=" ";   
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        newWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
		return newWord.trim();  
	}  
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=in.nextLine();
		System.out.println("The words after capitalization are: "+capitalizeWord(str));
		in.close();
	}

}
