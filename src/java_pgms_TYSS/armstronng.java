package java_pgms_TYSS;

public class armstronng {

	public static void main(String[] args) 
	{
	int no=153;
	int g=no;
	int count=0;
	while(no>0)
	{
		int rem=no%10;
		count=(rem*rem*rem)+count;
		no=no/10;
	}
	if(g==count)
	{
		System.out.println("arm strong");
	}
	else
	{
		System.out.println("not a arm strong");
	}

	}

}
