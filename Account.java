package interfaceclasswork;

public class Account {
   
	private int accno;
	private double balance;
	private String custname;
	public Account()
	{
		
	}
	public Account(int accno, double balance, String custname) {
		super();
		this.accno = accno;
		this.balance = balance;
		this.custname = custname;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
}
