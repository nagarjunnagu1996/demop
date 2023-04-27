package YTjava_pgms;

public class chect_given_no_prime_number {

	public static void main(String[] args) 
	{
		int no=2;
		int count=0;
		for (int i = 1; i <= no; i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("the given no is prime number");
		}else
		{
			System.out.println("given number is not a prime number");
		}
	}

}
