package project1;

public class StringOpertions {

	public static void main(String[] args) 
	{
		String str1="deloitte";
		String str2=new String("nexawaave");
		System.out.println("length is:"+str1.length());
		System.out.println(str1.lastIndexOf('i'));
		System.out.println(str1.indexOf('d'));
		System.out.println(str1.isEmpty());
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(2, 5));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.concat(" usi"));
		str1=str1.concat(" hyderabd");
		System.out.println(str1);
		System.out.println(str2.concat(" wave solutions"));
		System.out.println(str2);
		System.out.println(str1.charAt(6));
		//System.out.println(str1.isVowel('f'));
		System.out.println(str1.equals("deloitte"));
	}

}
