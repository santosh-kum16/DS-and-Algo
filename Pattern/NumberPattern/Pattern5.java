import java.util.Scanner;
class Pattern5
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
			for (int col=1; col<=(num-row); col++  )
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
