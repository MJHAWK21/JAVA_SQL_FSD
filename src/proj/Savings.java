package proj;

	
	public class Savings extends Account{
		private double minimumbalance;
		public Savings(int accno, Customer customerobj, double balance, double minimumbalance) {
			super(accno, customerobj, balance);
			this.minimumbalance = minimumbalance;
		}
		
		public double getminbalance() {
			return minimumbalance;
		}
		public void setminbalance(double minimumbalance){
			this.minimumbalance = minimumbalance;
			
		}
		public boolean withdraw(double amount) {
			if(balance-amount>minimumbalance) {
				balance-=amount;
				return true;
			}
			else {
				return false;
			}
		}
		
	}


