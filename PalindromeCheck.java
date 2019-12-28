package project1;

public class PalindromeCheck 
{
	public static void main(String[] args) 
	{
	 String name=args[0];
	 StringBuffer str1=new StringBuffer(name);
	 str1.reverse();
	 if(str1.toString().equals(name))
		 System.out.println("palindrome");
	 else
		 System.out.println("not a a palindrome");
	}

}
