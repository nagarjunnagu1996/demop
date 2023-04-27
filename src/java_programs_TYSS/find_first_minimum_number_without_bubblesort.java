package java_programs_TYSS;

public class find_first_minimum_number_without_bubblesort {

	public static void main(String[] args) 
	{
		int arr[]= {7,2,1,5};
		int fmin=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(fmin>arr[i])
			{
				fmin=arr[i];
			}
		}
		System.out.println(fmin);

	}

}
