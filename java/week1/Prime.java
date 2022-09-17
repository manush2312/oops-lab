import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the number:");
		n = sc.nextInt();

		for(i=2; i<n; i++)
		{
			if(n%i!=0)
				System.out.println("The number is prime:"+n);
				break;
		}
			else 
				{if
				System.out.println("The number is not prime");
			}
		}
	}
}