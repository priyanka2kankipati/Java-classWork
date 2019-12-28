package Inheritance;

public class StudentExam extends LibraryDetails {
	private int sub1;
	private int sub2;

	public StudentExam(int regno, String stdname, String group, int sub1, int sub2, int books) {
		super(regno, stdname, group, books);
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	@Override
	public void display() {
		System.out.println("from subclass");
	} 
	public void output() {
		int total = sub1 + sub2;
		System.out.println(regno + " " + stdname + " " + group + " " + total + " " + booksDue);

	}
	public static void main(String[] args) {
		Student student=new Student();
		StudentExam exam = new StudentExam(123, "priyanka", "ECE", 59, 90, 23);
		student.display();
		/*exam.display();
		 * student.display();
		*/
		student=exam;
		exam.display();
		exam.output();
	}
}
