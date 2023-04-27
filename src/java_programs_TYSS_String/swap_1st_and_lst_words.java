package java_programs_TYSS_String;

public class swap_1st_and_lst_words {

	public static void main(String[] args) 
	{
		String str="i am from bangalore";// o/p==> bangalore am from i
		String[] s = str.split(" ");
		
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}

	}

}
