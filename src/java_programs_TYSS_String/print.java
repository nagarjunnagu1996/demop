package java_programs_TYSS_String;

public class print {

	public static void main(String[] args) 
	{
		String str="D12J9U8O%P";
		String str1 = str.toLowerCase();
		for (int i =  str1.length()-1; i >=0; i--)
		{
			if(str1.charAt(i)>='a'&& str1.charAt(i)<='z')
			{
				System.out.println(str1.charAt(i));
			}
		}
	}

}
