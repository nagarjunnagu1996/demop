package java_pgms_TYSS;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class linkedhashmappractice {

	public static void main(String[] args) 
	{
	LinkedHashMap<Integer, String> map=new LinkedHashMap<>();
	map.put(10, "hi");
	map.put(20, "hello");
	map.put(30, null);
	map.put(null, "hello");
	map.put(30, "bye");
	map.put(40, "bye");
	map.put(null, "helo");
	map.put(70, null);
	map.put(100, null);
	System.out.println(map);
	System.out.println(map.containsKey(30));
	System.out.println(map.containsValue("helo"));
	for (Entry<Integer, String> m : map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
System.out.println(map.clone());
System.out.println(map.getOrDefault(30, null));
	}

}
