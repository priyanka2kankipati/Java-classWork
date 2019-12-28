package Inheritance;

public class LibraryDetails extends Student {
	protected int booksDue;

	public LibraryDetails(int regno, String stdname, String group, int booksDue) {
		super(regno, stdname, group);
		this.booksDue = booksDue;
	}
}
