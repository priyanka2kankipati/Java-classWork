package project1;

public class AccountAppln
{

	public static void main(String[] args)
	{
		Account account=new Account(101,"priyanka",34.5);
		/*account.setAccountNumber(101);
		account.setCustomerName("Priyanka");
		account.setBalance(345.00);*/
		System.out.println(account.getAccountNumber());
		System.out.println(account.getCustomerName());
		System.out.println(account.getBalance());
		System.out.println(account.getCustomerName());
	}
}
