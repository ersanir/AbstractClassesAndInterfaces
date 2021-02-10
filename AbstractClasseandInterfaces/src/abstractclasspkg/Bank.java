package abstractclasspkg;

abstract class Bank {
	
	final protected void withdraw() {
		System.out.println("Withdrawing money now....");
	}
	
	void deposit() {
		System.out.println("Depositing money now...");
	}
	
	protected abstract void calculateInterest() ;

}
