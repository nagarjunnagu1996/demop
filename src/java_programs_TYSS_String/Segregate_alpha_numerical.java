package java_programs_TYSS_String;

public class Segregate_alpha_numerical {

	public static void main(String[] args)
	{
		String s="a2b&d3e"; //op==> abde 23 &
		String alpha="";
		String num="";
		String special="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else 
			{
				special=special+s.charAt(i);
			}
		}
System.out.println(alpha+" "+num+" "+special);

	}

}
