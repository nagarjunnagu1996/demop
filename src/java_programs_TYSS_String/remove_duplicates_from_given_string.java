package java_programs_TYSS_String;

import java.util.LinkedHashSet;

public class remove_duplicates_from_given_string {

	public static void main(String[] args) 
	{
		String str="i am from am from bangalore";
		String[] s = str.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++)
		{
			set.add(s[i]);
		}
		for (String string : set) {
			System.out.print(string+" ");
		}

}

}
