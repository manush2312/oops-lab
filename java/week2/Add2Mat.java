import java.util.Scanner;

class Add2Mat
{
	public static void main(String[] args)
	{
		int i,m,n,p,q;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and columns of a:");
		m = sc.nextInt();
		n = sc.nextInt();
		int a[][] = new int[m][n];

		for( i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println();


		for( i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(a[i][j]+" ");
			}
		}
		System.out.println();

		System.out.println("Enter the rows and columns of b:");
		p = sc.nextInt();
		q = sc.nextInt();
		int b[][] = new int[p][q];


		

		

		for( i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println();


		for( i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.println(b[i][j]+" ");
			}
		}
		System.out.println();

		if(m==p && n==q)
			add(a,b,m,n);
		else 
			System.out.println("Cannot add");


		


	}

	static void add(int a[][], int b[][], int m, int n)
	{
		int c[][] = new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}

		

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(c[i][j]+" ");
			}
		}	
	}
}