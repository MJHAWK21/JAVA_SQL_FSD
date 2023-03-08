package single;


public class Singleclass {
	public static void main(String[]args) {
		Singleclass instance1=Singleclass.getInstance();
		Singleclass instance2=Singleclass.getInstance();
		if(instance1==instance2) {
			System.out.println("Both instances are same");
		}
		else {
			System.out.println("Both instances are different");
		}
		
	}