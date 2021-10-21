import java.util.Scanner;
class Pattern8
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of row to Print Star:");
		int num = scan.nextInt();
		printStar(num);
	}

	static void printStar(int num){
		System.out.println("Pattern is printed below:");
		for (int row=0; row<num; row++ )
		{
			// Column Value increased by 1
			for (int col=0; col<=row; col++  )
			{
				System.out.print(col+1+" ");
			}
			//Column Value Decreased by 1
			for (int col=row; col>=1 ; col-- )
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
