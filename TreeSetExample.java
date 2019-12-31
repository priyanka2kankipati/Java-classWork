package interfaceclasswork;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Employee> emp=new TreeSet<>();
		emp.add(new Employee(101,"proiyanka",78000.00));
		emp.add(new Employee(102,"tejaswi",45000));
		emp.add(new Employee(103,"uday kiran",56000));
		for(Employee em1:emp)
		{
			System.out.println(em1.getEmpcode());
		}
	}

}
