package kgfb;

public class Saving extends Accounts implements maintenancecharge {

	public Saving(String accno, String customername, double balance) {
		super(accno, customername, balance);
	}
	
     int m= 50;
     
     public float calculateMaintenanceCharge(float noOfyears) {
 		//float n= noOfyears;
 		float charge= (m*noOfyears)+50;
 				return charge;
 	}
}
