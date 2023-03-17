package practisee;


import java.util.*;
import java.util.stream.Collectors;

public class Kthlarge {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter k");
	 int k=sc.nextInt();
	 LinkedList<Integer>lis=new LinkedList<>();
	 lis.add(2);
	 lis.add(4);
	 lis.add(3);
	 lis.add(8);
	 List<Integer>lis1=lis.stream().sorted().collect(Collectors.toList());
	 System.out.println(lis1.get(lis1.size()-k));
	 
	 }


}