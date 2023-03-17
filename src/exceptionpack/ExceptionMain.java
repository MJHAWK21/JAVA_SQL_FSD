package exceptionpack;


public class ExceptionMain {

	public static void main(String[] args) throws InvalidPhoneNumberException {
		// TODO Auto-generated method stub
		ExceptionEmp e1 = new ExceptionEmp ("813691773314","finlana@gmail.com","nettikadan",01,"Finla","Trivandrum",23500);
		//ExceptionEmp e2 = new ExceptionEmp ("9400627642","finitana@gmail.com","Pallan",01,"Finita","Kochi",35000);
		//ExceptionEmp e3 = new ExceptionEmp ("9847260793","fionana@gmail.com","Parapully",01,"Fiona","Bombay",40000);

		
	
		try {
			 if (!e1.getPhoneno().matches("\\d{10}$")) {
			        throw new InvalidPhoneNumberException("Invalid phone number: " + e1.getPhoneno());
		} 
		}
		catch (InvalidPhoneNumberException e) {
		    System.err.println(e.getMessage());
		}
	}
	public static class InvalidPhoneNumberException extends Exception {
	    public InvalidPhoneNumberException(String message) {
	        super(message);
	    }
	}
}