import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		int n, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		n = sc.nextInt();
		r = sc.nextInt();

		int answer = factioral(n,r);
		System.out.println("The factorial of a given number is:" +answer);	
	}

	static int factioral(int n, int r)
	{
		int ans=1, ans2=1, ans3=1,i;
		for(i=1; i<=n; i++)
		{
			ans = ans*i;
		}


		for(i=1; i<=(n-r); i++)
		{
			ans2 = ans2*i;
		}

		for(i=1; i<=r; i++)
		{
			ans3 = ans3*i;
		}

		int jawab = FACTORIAL(ans, ans2, ans3);
		return(jawab);


		
	}

	static int FACTORIAL(int ans, int ans1, int ans2)
	{
		int m=0;
		 m = ans / ((ans1)*(ans2));
		 return(m);
	}
}