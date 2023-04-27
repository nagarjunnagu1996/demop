package java_programs_TYSS_String;

public class remove_spaces_between_the_words {

	public static void main(String[] args) 
	{
	//String str="i am from bangalore";//op==> iamfrombangalore
	//System.out.println(str.replace(" ", ""));
		
		//OR
		
		
		String str="i am from bangalore";//op==> iamfrombangalore
		String[] spl = str.split(" ");
		for (int i = 0; i < spl.length; i++) {
			System.out.print(spl[i]);
		}
		
		
		
	}

}
