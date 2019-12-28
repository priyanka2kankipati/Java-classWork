package Inheritance;

public class ClassOneApplication extends ClassOne {

	public ClassOneApplication(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	void output() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		ClassOne one = new ClassOneApplication(4, 3);
		one.output();

	}

}
