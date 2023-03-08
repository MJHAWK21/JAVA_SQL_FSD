package proj;

public abstract class Account {
        protected int accno;
        protected Customer customerobj;
        protected double balance;
        
        public Account(int accno,Customer customerobj, double balance) {
        	super();
        	this.accno = accno;
        	this.customerobj= customerobj;
        	this.balance= balance;
        }
        
        public int getaccno() {
        	return accno;
        }
        public void setaccno(int accno) {
        	this.accno= accno;
        }
        public Customer getcustomerobj() {
        	return customerobj;
        }
        public void setcustomerobj(Customer customerobj) {
        	this.customerobj= customerobj;
        }
        public double getbalance() {
        	return balance;
        }
        public void setbalance(double balance) {
        	this.balance= balance;
        }
        
        	
        
        public abstract boolean withdraw(double amount);
        
}
