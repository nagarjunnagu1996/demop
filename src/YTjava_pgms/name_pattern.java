package YTjava_pgms;

import java.util.LinkedHashSet;

public class name_pattern {

	public static void main(String[] args) {
		String s="NAGARJUNA";
		LinkedHashSet<Object> list=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++)
		{
			list.add(s.charAt(i));	
		}
		System.out.println(list);
		for (Object object : list) 
		{
			for (int i = 0; i < s.length(); i++)
			{
				if(object.equals(s.charAt(i) && s.charAt(i)=='a')) 
				{
					
				}
			}	
		}

	}

}
