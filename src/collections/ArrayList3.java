package collections;
import java.util.*;
public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList <String>();
		list.add("john");
		list.add("mary");
		list.add("annie");
		list.add("anoop");
		for(String fruit: list) {
			System.out.println(fruit);
		}
	}

}
