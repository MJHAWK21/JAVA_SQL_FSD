package practisee;

import java.util.Scanner;

public class JavaStaticInitBlock
{
	static int B,H;
	static boolean flag = true;
	static {
    	Scanner sc = new Scanner(System.in);
    	B = sc.nextInt();
	    H = sc.nextInt();
	    if(B<=0 || H<=0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
		}
	}
}
