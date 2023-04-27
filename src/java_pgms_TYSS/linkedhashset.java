package java_pgms_TYSS;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) 
	{
	LinkedHashSet<Object> link=new LinkedHashSet<>();
	link.add("hi");
	link.add("hi");
	link.add(10);
	link.add(null);
	link.add(50);
	link.add(null);
	System.out.println(link);
	ArrayList<Object> list=new ArrayList<>();
	list.add(60);
	list.add(80);
	list.add("welcome");
	list.add(null);
	list.add(null);
	list.add(80);
	list.add(80);
	System.out.println(list);

	}

}
