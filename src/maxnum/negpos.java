package maxnum;

import java.util.Scanner;

public class negpos {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of elements in an array");
		int num=sc.nextInt();
		int arr[]= new int[num];
		System.out.println("enetr the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();		}
		int pcount=0; int ccount=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>0) {
				 pcount++;
				 
			}
			else if(arr[j]<0)
				ccount++;
			
		}System.out.println("The number of positive numbers:" +pcount);
		System.out.println("The number of negative numbers:" +ccount);
	}

}
