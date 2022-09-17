	import java.util.Scanner;

class Sort{

	static void bubblesort(int arr[], int n)
	{
		
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=1;j<n-1;j++)
				{
					if(arr[j-1]>arr[j])
					{
						arr[j-1] = temp;
						arr[j-1] = arr[i];
						arr[j] = temp;
					}
				}
		}
	}



	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println();

		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

		System.out.println();

		bubblesort(arr, n);

		System.out.println("After bubble sort");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}