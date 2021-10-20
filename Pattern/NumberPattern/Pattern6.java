import java.util.Scanner;
class Pattern6
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
		for (int row=num; row>0; row-- )
		{
			for (int col=row; col>0; col--  )
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
