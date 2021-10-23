import java.util.Scanner;
class Pattern19
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of row to Print Pattern:");
		int num = scan.nextInt();
		printStar(num);
	}

	static void printStar(int num){
		System.out.println("Pattern is printed below:\n");
		for (int row=1; row<=num; row++ )
		{
			for (int col=1; col<=row; col++  )
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}
}
