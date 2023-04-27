package java_pgms_TYSS;

import java.util.TreeMap;
import java.util.Map.Entry;

public class treemappractice {

	public static void main(String[] args) 
	{
	TreeMap<Integer, Object> map= new TreeMap<>();
	map.put(10, null);
	map.put(10, null);
	map.put(1000, "ok");
	map.put(5, null);
	map.put(19, "hello");
	map.put(110, 10);
	map.put(30, "bye");
	map.put(40, 20);
	System.out.println(map);
	for (Entry<Integer, Object> m : map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}

	}

}
