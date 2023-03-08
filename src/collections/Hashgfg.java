package collections;
import java.io.*;
import java.util.*;

public class Hashgfg{
	private static void FindCommonElement(int []arr1, int[]arr2)
	{
		int i,j;
		Set<Integer> set =new HashSet<Integer>();
		for(i=0;i<arr1.length;i++) {
			for(j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					set.add(arr[1]);
					break;
				}
			}
		}
	}
}