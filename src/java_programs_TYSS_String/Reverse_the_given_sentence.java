package java_programs_TYSS_String;

public class Reverse_the_given_sentence {

	public static void main(String[] args) 
	{
	String s="i am from bangalore";  // o/p=> bangalore from am i
	String[] splitted = s.split(" ");
	for (int i = splitted.length-1; i >=0 ; i--) {
		System.out.print(splitted[i]+" ");
	}

	}

}
