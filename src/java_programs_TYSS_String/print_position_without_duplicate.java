package java_programs_TYSS_String;

import java.util.LinkedHashSet;

public class print_position_without_duplicate {

	public static void main(String[] args) 
	{
	String s="tester";//t=1 e=2 s3 r=6
	String s1 = s.toLowerCase();
	LinkedHashSet<Character> set=new LinkedHashSet<>();
	for (int i = 0; i < s1.length(); i++) {
		set.add(s1.charAt(i));
	}
	for (Character cha : set) {
		for (int j = 0; j < s1.length(); j++) 
		{
		if(cha==s1.charAt(j))
		{
			System.out.println(cha+" "+(j+1)+" "+"position");
			break;
		}
		}
	}

	}

}
