package java_programs_TYSS_String;

import java.util.LinkedHashSet;

public class print_occurance_of_second_max_character 
{
	public static void main(String[] args)
	{
		String s="naaagaaagggrrrjjunnn";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		int fmax=0;
		int smax=0;
		int tmax=0;

		for (int i = 0; i < s.length(); i++)
		{
			int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}	
		}

	}


}
