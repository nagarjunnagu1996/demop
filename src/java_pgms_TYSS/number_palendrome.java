package java_pgms_TYSS;

public class number_palendrome {

	public static void main(String[] args) {
	int no=121;
	int g=no;
	int count=0;
	while(no>0)
	{
		int rem=no%10;
		count=rem+count*10;//1,12
		no=no/10;
	}
	if(count==g)
	{
		System.out.println("palendrome");
	}

	}

}
