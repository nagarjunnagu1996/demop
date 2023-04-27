package YTjava_pgms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class occurance_of_particular_char {

	public static void main(String[] args) 
	{
		String s="nagarjun";
		String[] s1 = s.split(s);

		LinkedHashSet<Character> list =new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++)
		{
			list.add(s.charAt(i));	
		}
		for (Character cha : list)
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if(cha==s.charAt(i) && s.charAt(i)=='a'||cha==s.charAt(i) && s.charAt(i)=='n')
				{
					count++;

				}
			}
			if(cha=='a'||cha=='n')
			{
				System.out.println(cha+" "+count);
			}
			
		}
	}
}
