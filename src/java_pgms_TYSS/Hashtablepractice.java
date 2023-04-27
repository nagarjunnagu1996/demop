package java_pgms_TYSS;

import java.util.Hashtable;

public class Hashtablepractice {

	public static void main(String[] args) 
	{
		Hashtable<Integer, String>	table= new Hashtable<Integer, String>();
		table.put(10, "hi");
		table.put(30, "bye");
		table.put(30, "oke");
		table.put(40, "bye");
		table.put(50, "bye");
		table.put(190, "welcome");
		table.put(100, "hi");
System.out.println(table);
	}

}
