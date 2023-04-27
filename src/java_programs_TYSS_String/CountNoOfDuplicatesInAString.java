package java_programs_TYSS_String;

import java.util.LinkedHashSet;

public class CountNoOfDuplicatesInAString {

	public static void main(String[] args) 
	{
		String s="TestYantra";
		String s1 = s.toLowerCase();
		LinkedHashSet<Character> map=new LinkedHashSet<>();
		for (int i = 0; i < s1.length()-1; i++) 
		{
			map.add(s1.charAt(i));
		}
		for (Character ch : map) 
		{
			int count=0;
			for (int i = 0; i < s1.length()-1; i++) 
			{
				if(ch==s1.charAt(i)) 
				{
					count++;
				}
			}
			if(count>1) {
				System.out.println(ch+" is repeating at "+count+" times");
			}
		}
	}

}
