package kalpana_mam_questions;

public class replace_dot_withspace {

	public static void main(String[] args) 
	{
		String s="update.decline.accept.include";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='.')
			{
				ch[i]=' ';
			}
		}
	}

}
