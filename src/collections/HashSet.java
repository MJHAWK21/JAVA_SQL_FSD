package collections;
import java.io.*;
import java.util.*;

public class HashSet {
  private static void FindcommonElement(String[] arr1,String[] arr2) {
	  Set<String> set=new HashSet<>();
	  for(int i=0;i<arr1.length;i++) {
		  for(int j=0;j<arr2.length;j++) {
			  if(arr[i]==arr[j]) {
				  set.add(arr1[i]);
				  break;
			  }
		  }
	  }
	  for(String i:set) {
		  System.out.print(i +"");
	  }
	      
  }
  public s
}
