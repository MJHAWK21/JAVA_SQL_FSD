package kgfb;

public class Accounts {
	private String accno;
	private String customername;
	private double balance;
	
	public Accounts(String accno, String customername, double balance) {
		this.accno= accno;
		this.customername= customername;
		this.balance=balance;
	}
	public String getaccno() {
		return accno;
	}
	public void setaccno(String accno) {
		this.accno=accno;
	}
	public String getcustomername() {
		return customername;
	}
    public void setcustomername(String customername) {
    	this.customername=customername;
    }
    public double getbalance() {
    	return balance;
    }
    public void setbalance(double balance) {
    	this.balance = balance;
    }
}
