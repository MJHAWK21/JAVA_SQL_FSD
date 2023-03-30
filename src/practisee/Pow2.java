package practisee;

import java.util.Scanner;

public class Pow2 {
	public static boolean pow(int n) {
		while(n%2==0) {
			n=n/2;
		}
		if(n==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main (String[]args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(pow(n));
	}

}
