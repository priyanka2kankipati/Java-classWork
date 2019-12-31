package interfaceclasswork;

import java.util.Scanner;

public class AccountApplication {
	public static void main(String[] args) {
		AccountOperations oper = new AccountOperations();
		Scanner sc = new Scanner(System.in);
		int choice;
		int accno;
		double amount;
		do {
			System.out.println("enter ur choice:1.Deposit\n2.withdrawl\n3.check balance4.exit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("enter account no:");
				accno = sc.nextInt();
				System.out.println("enetr amount to deposit:");
				amount = sc.nextDouble();
				oper.deposit(accno, amount);
				break;
			case 2:
				System.out.println("enter account no:");
				accno = sc.nextInt();
				System.out.println("enetr amount to withdraw:");
				amount = sc.nextDouble();
				oper.withdraw(accno, amount);
				break;
			case 3:
				System.out.println("enter account no:");
				accno = sc.nextInt();
				oper.checkBalance(accno);
				break;
			case 4:
				System.exit(0);;
			default:
				break;
			}
		} while (choice > 0);
	}
}
