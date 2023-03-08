package collections;
import java.util.*;
public class Target {
        public static void main(String []args) {
        	int num,flag=1;
        	ArrayList <Integer>list=new ArrayList<Integer>();
        	Scanner s=new Scanner(System.in);
        	System.out.println("enter the numbers:");
        	for(int i=0;i<5;i++) {
        		num=s.nextInt();
        		list.add(num);
        	}
        	for(int i=0;i<5;i++) {
        		for(int j=0;j<5;j++) {
        			if(list.get(i)+list.get(j)==25) {
        			flag=0;
        			}
        		}
        	}
        	if(flag==0) {
        		System.out.println("target found");
        	}
        	else {
        		System.out.println("Invalid");
        	}
        }
}
