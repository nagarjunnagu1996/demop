package java_programs_TYSS;

public class Array_Bubblesort_ascending_order {

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
		System.out.println();
		System.out.println("the first minimum number is    "+arr[0]);//ro find first minimum
		

	}

}
