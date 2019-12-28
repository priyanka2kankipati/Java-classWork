package Inheritance;

public class MutableStrings 
{
	public static void main(String[] args) 
	{
	 String name=args[0];
	 String str2;
	 StringBuffer str1=new StringBuffer(name);
	 str1.reverse();
	 System.out.println(str1);
	 str2=str1.toString();
	 System.out.println("string class member:"+str2);
	 if(str1.toString().equals(name))
		 System.out.println("palindrome");
	 else
		 System.out.println("not a a palindrome");
	}
}

