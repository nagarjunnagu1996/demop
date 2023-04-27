package java_programs_TYSS;

public class find_sumof_first_three_minimum_numbers_inarray {

	public static void main(String[] args)
	{
		int []arr= {7,2,0,1,5};
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		
		}
		int sum=0;
		for (int i = 0; i < 3; i++) 
		{
		sum=sum+arr[i];	
		}
		System.out.println();
		System.out.println("the sum of first three number is  "+sum);
	}

}
