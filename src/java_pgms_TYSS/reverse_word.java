package java_pgms_TYSS;

public class reverse_word {

	public static void main(String[] args) {
		String s="gadag";
		String t=s;
		String rev="";
		for (int i = s.length()-1; i >=0 ; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(t.equals(rev))
		{
			System.out.println(" a palendrome");
		}
		else
		{
			System.out.println("not a palendrome");
		}
	}

}
