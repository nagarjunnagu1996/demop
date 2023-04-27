package java_programs_TYSS;

public class Find_minimum_number_in_array_bubblesorted {

	public static void main(String[] args) {
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
		System.out.println("the first minimum number is    "+arr[0]);
		System.out.println("the second minimum number is  "+ arr[1]);
		System.out.println(arr.length-1);//size of array
		System.out.println("maximum number is  "+arr[arr.length-1]);
	}

}
