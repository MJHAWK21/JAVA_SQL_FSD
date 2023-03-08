package kgfb;

public class current extends Accounts implements maintenancecharge {

	public current(String accno, String customername, double balance) {
		super(accno, customername, balance);
	
	}
      int m=100;
     
	public float calculateMaintenanceCharge(float noOfyears) {
		float n= noOfyears;
		float charge= (m*n)+200;
				return charge;
	}
	
	

}
