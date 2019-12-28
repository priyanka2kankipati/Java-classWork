package Inheritance;

public class Student {
	protected int regno;
	protected String stdname;
	protected String group;

	public void display() {
		System.out.println("from super class");
	}

	public Student(int regno, String stdname, String group) {
		this.regno = regno;
		this.stdname = stdname;
		this.group = group;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
}
