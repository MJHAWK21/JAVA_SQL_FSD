package numbers;

import java.util.Scanner;

public class palin {
     public static void main(String[]args) {
    	 int sum=0,rem,temp;
    	 Scanner sc=new Scanner(System.in);
    	 int num=sc.nextInt();
    	 temp=0;
    	 while(num!=0) {
    		 rem=num%10;
    		 sum=sum*10+rem;
    		 num=num/10;			 
    		 
    	 }
    	 if(temp==sum)
    		 System.out.println("the number is palindrome");
    	 else
    		 System.out.println("its not palindrome");
     }
}
