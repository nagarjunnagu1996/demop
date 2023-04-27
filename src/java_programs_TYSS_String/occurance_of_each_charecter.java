package java_programs_TYSS_String;

import java.nio.MappedByteBuffer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

public class occurance_of_each_charecter {
	 static char famxdata;
	 static char smaxdata;
	 static char tmaxdata;

	public static void main(String[] args)
	{
		int fmax=0;
		int smax=0;
		int tmax=0;
		
		String s="naaagaaagggrrrjjunnn";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for (Character chara : set) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++)
			{
				if(chara==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(chara+" is present    "+count);
		
			map.put(chara, count);
		
		}
		System.out.println(map);
	for (Entry<Character, Integer> key:map.entrySet() )
	{
	
		Character data=key.getKey();
		Integer datavalue = key.getValue();
		if(datavalue>fmax)
		{
		fmax=datavalue;
		famxdata=data;
		}
		
		}
	
	System.out.println(fmax+" "+smax+" "+tmax);
	System.out.println(famxdata);
	System.out.println(smaxdata);

	}

}
