package java_programs_TYSS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Remove_duplicatest {

	public static void main(String[] args)
	{
		int a[]= {2,4,4,6,5,6};	

		HashSet<Integer> map=new HashSet<>();
		for (int i = 0; i < a.length; i++) 
		{
			map.add(a[i]);
		}
		for (Integer intgevalue : map) 
		{
			System.out.println(intgevalue);
		}
	}

}
