package java_programs_TYSS_String;

import java.util.LinkedHashSet;

public class occurance_of_each_word_in_string {

	public static void main(String[] args) 
	{
		String str="i am from bangalore";
		String[] s = str.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}
		for (String stri : set) {
			int count=0;
			for (int j = 0; j < s.length; j++) {
				if(stri.equals(s[j]))
				{
					count++;
				}
			}
			System.out.println(stri+" is repeating  "+ count+"  times");
		}
	}

}
