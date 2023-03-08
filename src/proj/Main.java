package proj;

public class Main {

	public static void main(String[] args) {
		Customer f= new Customer(21, "MEERA", "MEERA@123");
		Savings d= new Savings(342, f, 3456, 1000);
		System.out.println(d.withdraw(450));
	           System.out.println(d.getbalance());
		}
		

	}


