package interfaceclasswork;

public class AccountOperations {
	Account[] accounts = new Account[5];
	int count = 0;
	int count1 = 0;
	double balance1;

	public AccountOperations() {
		accounts[0] = new Account(10011, 8000, "priyanka");
		accounts[1] = new Account(10012, 10000, "rahul");
		accounts[2] = new Account(10013, 9000, "vinay");
		accounts[3] = new Account(10014, 5000, "raj");
		accounts[4] = new Account(10015, 10000, "kritika");
	}

	void deposit(int acno, double amount) {
		for (int i = 0; i < accounts.length; i++) {
			if (acno == accounts[i].getAccno()) {
				System.out.println("welcome to ur account");
				balance1 = accounts[i].getBalance() + amount;
				accounts[i].setBalance(balance1);
				count++;
			}
		}
		// System.out.println(count);
		if (count == 0) {
			try {
				throw new AccountNumberNotFoundException();
			} catch (AccountNumberNotFoundException e) {

				e.getMessage();
			}

		}
	}

	void withdraw(int acno, double amount) {
		for (int i = 0; i < accounts.length; i++) {
			if (acno == accounts[i].getAccno()) {
				System.out.println("welcome to ur account");
				if (accounts[i].getBalance() < amount)
					try {
						throw new InsufficinetBalanceException();
					} catch (InsufficinetBalanceException e) {

						System.out.println(e.getMessage());
						return ;
					}
				else {
					balance1 = accounts[i].getBalance() - amount;
					accounts[i].setBalance(balance1);
				}
			}
		}
		if (count1 == 0) {
			try {
				throw new AccountNumberNotFoundException();
			} catch (AccountNumberNotFoundException e) {

				e.getMessage();
			}
		}

	}

	void checkBalance(int acno) {
		for (int i = 0; i < accounts.length; i++) {
			if (acno == accounts[i].getAccno()) {
				System.out.println("balance is:" + accounts[i].getBalance());

			}
		}

	}
}
