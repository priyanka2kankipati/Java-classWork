package interfaceclasswork;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int empcode=sc.nextInt();
		String name=sc.next();
		double salary=sc.nextDouble();
		//collection of user defined datatype 
		ArrayList<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee(empcode,name,salary));
		emplist.add(new Employee(++empcode,"priyanka",salary+10000));
		for(Employee i:emplist)
		{
			System.out.println(i);
			//printing obj prints address since it is user defined datatype
			//System.out.println(i.getEmpcode()+" "+i.getEmpname()+" "+i.getSalary());
		}
		
	}

}
