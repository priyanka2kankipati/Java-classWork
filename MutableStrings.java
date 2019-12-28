package project1;

public class MutableStrings {

	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer();
		sb1.append("deloitte");
		System.out.println(sb1);
		sb1=sb1.append("hyd");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		System.out.println(sb1.length());
	    System.out.println(sb1.delete(1, 2));
	    System.out.println(sb1.replace(0, 11, "deloitte hyd"));
	    String str="apple";
	    
	    StringBuffer str2=new StringBuffer();
	    str2.append(str);//strin class obj can be used for stringbuffer
	    System.out.println(str2);
	    //str.concat(str2);//stringbuffer obj cant be used for string class object
	    str2.append("ball");
	    String str3=str2.toString();
	    System.out.println(str3);
	    StringBuilder str4=new StringBuilder();
	    str4.append("adbcd");
	    System.out.println(str4);
	    
	}

}
