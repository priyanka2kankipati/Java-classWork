package interfaceclasswork;

public class InsufficinetBalanceException extends Exception {
	public InsufficinetBalanceException() {
		super("Insufficient amount to withdraw");
	}

}
