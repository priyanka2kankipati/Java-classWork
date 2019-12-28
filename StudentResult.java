package project1;

public class StudentResult 
{
	public static void main(String[] args)
	{
	  int regno=001;
	  double sub1=87;
	  double sub2=39.5;
	  double sub3=38;
	  double total=sub1+sub2+sub3;
	  double average=total/3;
     if(sub1>=40&&sub2>=40&&sub3>=40)
	  System.out.println("pass");
     else
	  System.out.println("fail");
	}
}
