package kgfb;

import java.util.Scanner;
public class UserInterface {

	public static void main(String[] args) {
		int choice,balance;
		String accno;
		String customername;
		float noOfyears;
		Scanner in= new Scanner(System.in);
		System.out.println("1.savings account\n 2.current account\n enter your choice: ");
		choice=in.nextInt();
		System.out.println("enter your acc no:");
		accno = in.next();
        System.out.println("ENETR YOUR BALANCE");
        balance= in.nextInt();
        System.out.println("enter customer name");
        customername= in.next();
        System.out.println("enter years:");
        noOfyears= in.nextFloat();
	
     //Accounts a= new Accounts(accno,customername,balance);
     current c=new current(accno,customername,balance);
     Saving d= new Saving(accno,customername,balance);
     System.out.println("name");
     if (choice == 1) {
    	 
    	 System.out.println(d.calculateMaintenanceCharge(noOfyears));}
     else if(choice==2)
    	 System.out.println(c.calculateMaintenanceCharge(noOfyears));
     else
    	 System.out.println("invalid");
     }
	}


