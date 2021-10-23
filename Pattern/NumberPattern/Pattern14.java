import java.util.Scanner;
class Pattern14
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
			//Printing Upper Part of Triangle
			for (int i=num-(row+1); i>=1 ;i-- )
			{
				System.out.print("1 ");
			}
			//Printing Lower Part of Triangle
			for (int col=0; col<=row; col++  )
			{
				System.out.print(row+1+" ");
			}
			System.out.println();
		}
	}
}
