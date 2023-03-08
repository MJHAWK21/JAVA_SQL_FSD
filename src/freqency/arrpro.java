package freqency;

import java.util.Scanner;

public class arrpro {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of elements in array");
		int num= sc.nextInt();
		int arr[]=new int[num];
		System.out.println("enetr the elements of array");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();		}
		
		System.out.println("the elements of array are");
		printArray(arr);	
		
		int sum=0;
	
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			arr[i]=sum;
		}
		System.out.println("the cumunlative sum is");
		printArray(arr);
	}

		
		static void printArray(int arr[]) {
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]+"");
		}
		
	}
	
      
       

