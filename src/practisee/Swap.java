package practisee;
import java.util.*;

public class Swap {
	public static boolean swapnum(int a,int b) {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("The swapped numbers are: " +a  +" and " +b);
		return true;
	}
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.print(swapnum(a,b));
		}

}