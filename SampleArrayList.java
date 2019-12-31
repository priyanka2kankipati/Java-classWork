package interfaceclasswork;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {

	public static void main(String[] args) {
		//primitive data types are added into the collection
		ArrayList list=new ArrayList();
		int b;
		list.add(234);
		list.add(34.6);
		list.add("deloitte");
		list.add(null);
		System.out.println(list);
		list.add("hyd");
		list.add(2,"java");
		System.out.println(list+" "+list.size());
		list.remove(new Double(34.6));
		System.out.println(list);
		Iterator it1=list.listIterator();
		while (it1.hasNext()) 
		{
			Object obj=it1.next();
			if(obj instanceof String)
				//since primitive values are added to collection printing obj will not print address
			System.out.println(obj);
			
		}
	}

}
