package java_programs_TYSS_String;

import java.util.LinkedHashSet;

public class print_no_of_ovels_in_a_string {

	public static void main(String[] args) {
		String s="Software testing";
		String str = s.toLowerCase();
		char[] s1 = str.toCharArray();
		int count=0;
		LinkedHashSet<Character> map=new LinkedHashSet<>();
		for (int i = 0; i < s1.length; i++) 
		{
			map.add(s1[i]);
		}
		for (Character ch : map) 
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				System.out.println(ch);
			}
		}
		System.out.println("no of vowels "+count);

	}

}
