package java_programs_TYSS;

public class swap_string_without_third_variable {

	public static void main(String[]args) 
	{
	String s="nagarjun";
	String s1="nagu";
	s=s+s1;
	System.out.println(s);//nagarjunnagu
	s1=s.substring(0, s.length()-s1.length());
	//s1=nagarjun       nagu
	s=s.substring(s1.length());
	System.out.println(s+  "  "+s1 );
	}

}
