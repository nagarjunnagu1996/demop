package YTjava_pgms;

import java.util.ArrayList;
import java.util.Arrays;

public class anagram_pgm {

	public static void main(String[] args) 
	{
		String s="ugna";
		char[] s1 = s.toCharArray();
		String s2="nagu";
		char[] s3 = s2.toCharArray();
		Arrays.sort(s3);
		Arrays.sort(s1);
		
		boolean result = Arrays.equals(s1, s3);
		if(result)
		{
			System.out.println("given string is anagram");
		}
		else
		{
			System.out.println("given string is not a anagram ");
		}
			




	}

}
