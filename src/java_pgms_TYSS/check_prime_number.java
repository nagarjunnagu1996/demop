package java_pgms_TYSS;

public class check_prime_number {

	public static void main(String[] args) 
	{
		int no=2;
		int count=0;
		for (int i = 1; i <=no; i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("this no is prime number");
		}else
		{
			System.out.println("not a pm");
		}
	}

}
