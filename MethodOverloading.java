package project1;

public class MethodOverloading 
{
	void add(int x,int y)
	{
		System.out.println("int:"+(x+y));
	}
	void add(String str1,double dou1)
	{
		System.out.println(str1+" "+dou1);
	}

	public static void main1(String[] args) 
	{
		MethodOverloading methods=new MethodOverloading();
		methods.add(10, 812);
		methods.add("priyanka",45.7);

	}
	public static void main(String[] args) 
	{
		MethodOverloading methods=new MethodOverloading();
		methods.add(10, 812);
		methods.add("priyanka",45.7);
		String a[]={"ad","fd","ghf"};
		MethodOverloading.main1(a);
		

	}

}
