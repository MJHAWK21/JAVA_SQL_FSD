package collections;

import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList <String>list=new ArrayList <String>();
		list.add("Mango");
		list.add("orange");
		list.add("apple");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		
	}

}
