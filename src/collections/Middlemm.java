package collections;
import java.util.LinkedList;
public class Middlemm {
      public static void main(String[]args) {
    	  LinkedList <Integer> ll=new LinkedList<>();
          ll.add(2);
    	  ll.addFirst(3);
    	  ll.addLast(7);
    	  ll.addLast(9);
    	  ll.addLast(8);
    	  System.out.println("LinkedList:" +ll);
    	  int middle=ll.get(ll.size()/2);
    	  System.out.println("Linked list:" +middle);
      }
}

