package interfaceclasswork;

public class Employee 
{
	private int empcode;
	private String empname;
	private double salary;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public Employee(int empcode, String empname, double salary) {
		super();
		this.empcode = empcode;
		this.empname = empname;
		this.salary = salary;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
