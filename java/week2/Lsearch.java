import java.util.Scanner;

class Lsearch
{
	public static void main(String[] args)
	{
		int n,ele;
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

		System.out.println("Enter the element to be searched:");
		ele = sc.nextInt();


		Linear(arr,ele,n);		

	}


	static void Linear(int arr[], int ele, int n)
	{
		int flag = 0;
		for(int i=0;i<n;i++)
		{
			if(ele == arr[i]){
				flag = 0;
				break;
			}
			else{
				flag = 1;
			}
		}

		if(flag == 0)
			System.out.println("FOund");
		else
			System.out.println("Not FOund");
	}
}