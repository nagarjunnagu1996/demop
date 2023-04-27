package YTjava_pgms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.sun.jdi.Value;

public class abc {

	static Integer fmax=0;
	static Integer smax=0;
	static Integer tmax=0;
	public static void main(String[] args) 
	{

		String s="nnnnnahhhaggggasfafaasssjjkk";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		TreeMap<Character, Integer> map1=new TreeMap<>();
		ArrayList<Integer> arlis=new ArrayList<>();
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));	
		}
		for (Character value : set) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++)
			{
				if(value==s.charAt(i))
				{
					count++;
				}
			}	
			map1.put(value, count);
		}
		System.out.println(map1);

//		for (Entry<Character, Integer> value: map1.entrySet())
//		{
//			//System.out.println(map1);
//		
//		}
		
	}

}
