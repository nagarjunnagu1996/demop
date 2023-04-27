package java_programs_TYSS_String;

import java.util.LinkedHashSet;

public class print_position_from_last_without_duplicate {

	public static void main(String[] args) {
		String s="tester";//t=4 e=5 s=3 r=6
		String s1 = s.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for (int i = 0; i < s1.length(); i++) {
			set.add(s1.charAt(i));
		}
		for (Character cha : set) {
			for (int j = s1.length()-1; j>=0 ; j--) 
			{
				if(cha==s1.charAt(j))
				{
					System.out.println(cha+"   is in  "+(j+1)+" "+"position");
					break;
				}
			}
		}

	}

}
