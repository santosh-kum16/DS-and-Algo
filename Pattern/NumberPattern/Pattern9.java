import java.util.Scanner;
class Pattern9 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of row to Print Star:");
		int num = scan.nextInt();
		printStar(num);
	}

	static void printStar(int num){
		System.out.println("Pattern is printed below:\n");
		for (int row=num; row>=1; row-- )
		{
			// Printing upper half of the pattern
			for (int col=1; col<=row; col++  )
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		for (int row=2; row<=num; row++ )
		{
			// printing lower half of the pattern
			for (int col=1; col<=row; col++  )
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
