package proj;

public class Customer {
	private int customerid;
	private String customername;
	private String emailid;
	public Customer(int customerid, String customername, String emailid) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.emailid = emailid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	

}
