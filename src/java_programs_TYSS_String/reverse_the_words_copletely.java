package java_programs_TYSS_String;

public class reverse_the_words_copletely {

	public static void main(String[] args) 
	{
		String s="i am from bangalore";  // op===> i ma morf reolagnab
		String[] splitted = s.split(" ");
		
		for (int i = 0; i < splitted.length; i++) 
		{
			String st = splitted[i];
			for (int j = st.length()-1; j >=0;j--)
			{
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
