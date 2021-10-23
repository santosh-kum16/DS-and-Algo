import java.util.Scanner;
class Pattern17
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
		for (int row=0; row<num; row++ )
		{
			for (int col=row; col<num; col++  )
			{
				System.out.print(col+1+" ");
			}
			for (int c=1; c<=row ;c++ )
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
