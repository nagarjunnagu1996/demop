package java_pgms_TYSS;

import java.util.HashMap;
import java.util.Map.Entry;


public class Hashmappractice {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
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
		{System.out.println(m.getKey()+" "+m.getValue());
			
		}
		System.out.println(map.size());
		System.out.println(map.replace(10, "hihi"));
		

	}

}
