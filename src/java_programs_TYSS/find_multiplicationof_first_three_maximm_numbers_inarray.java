package java_programs_TYSS;

public class find_multiplicationof_first_three_maximm_numbers_inarray {

	public static void main(String[] args) {
		int []arr= {7,2,0,1,5};
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		
		}
		int mul=1;
		for (int i = 0; i < 3; i++) 
		{
		mul=mul*arr[i];	
		}
		System.out.println();
		System.out.println("the multiplication of first three maximum number is  "+mul);

	}

}
