package java_pgms_TYSS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class collection1 {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		list.add(10);
		list.add("hi");
		list.add("hi");
		list.add(20);
		list.add(null);
		list.add(null);
		System.out.println(list);
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(50);
		list1.add(20);
		list1.add(5);
		list1.add(60);
		Collections.sort(list1);// sort the elements in ascending order
		System.out.println(list1);
		//add all elements from list1 to list
		list.addAll(list1);
		System.out.println(list);
		if(list.contains("hi"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		list.remove(4);
		for (Object alldata : list)
		{
		System.out.println(alldata);	
		}
		Iterator<Object> it = list.iterator();
		while(it.hasNext())
		{
			Object alldata = it.next();
			System.out.println(alldata);
		}
		System.out.println(list.get(5));
		System.out.println(list.size());
		System.out.println(list.indexOf("hi"));

	}

}
