package project1;

public class CommandLineEx 
{
	public static void main(String[] args)
	{
	 String name=args[0];
	 System.out.println(name);
	 for(int i=0;i<name.length();i++)
	 {
		 System.out.println(name.charAt(i));
	 }
	 for(int i=0;i<name.length();i++)
	 {
		 System.out.println(name.substring(0,i));
	 }
	}
}

