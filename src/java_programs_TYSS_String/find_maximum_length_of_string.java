package java_programs_TYSS_String;

public class find_maximum_length_of_string {

	public static void main(String[] args) 
	{
		String[] s= { "ab","abc","abcd","dgfh","ed"}; //abcd dgfh
		String max_length=s[0];
		for (int i = 0; i < s.length; i++)
		{
			if(s[i].length()>max_length.length())
			{
				max_length=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].length()==max_length.length())
			System.out.println(s[i]);
		}	
	}

}
