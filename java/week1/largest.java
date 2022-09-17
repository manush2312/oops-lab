import java.util.Scanner;
class largest
{
	public static void main(String args[])
	{
		int a,b,c;
	 	Scanner  sc =  new Scanner(System.in);
	 	a = sc.nextInt();
	 	b = sc.nextInt();
	 	c = sc.nextInt();

	 	int large = largest(a,b,c);
	 	System.out.println("The largest number is: "+large);
	}



static int largest(int a, int b, int c)
{
	int m=0;
	if(a>b)
	{
		if(a>c)
			m = a;
		
		else 
			m = c;

	}
	else 
	{
		if(b>c)
		
			m = b;
		
		else 
			m = c; 

	}

	return(m);
}
}