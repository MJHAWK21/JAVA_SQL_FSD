package maxnum;

import java.util.Scanner;

public class Maxinum {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of elements");
		int num= sc.nextInt();
		int arr[]= new int[num];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();		}
		int max;
		max= arr[0];
		for(int j=1;j<arr.length;j++) {
			if(arr[j]>max) {
				max=arr[j];
				System.out.println(max);
			}
		}
	}
}
		
	


