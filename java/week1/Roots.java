import java.util.Scanner;
class Roots
{
	public static void main(String args[])
	{
		double a,b,c,x,y;
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-efficients of equation:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		double disc = ((b*b)-(4*a*c));
		if(disc>0)
		{
			
			n=0;
		}else if(disc==0)
		{
			n=1;

		}
		else if(disc<0)
		{
			n=2;
		}

		System.out.println("The roots are:");
		

		switch(n)
		{
		case(0):
			{
				System.out.println("The roots are real");
				x = (-b+Math.sqrt(disc))/(2*a);
				y = (-b-Math.sqrt(disc))/(2*a);
				System.out.println("Roots are"+x+ " and "+y);
			}

		case(1):
			{
				System.out.println("The roots are real and equal.");
				x = (-b+Math.sqrt(disc))/(2*a);
				y = (-b-Math.sqrt(disc))/(2*a);
			}

		case(2):
			{
				System.out.println("The roots are imaginary.");
			}

		}





















































































































































































































































































































































































































































































































































































































































































































































		
	}
}