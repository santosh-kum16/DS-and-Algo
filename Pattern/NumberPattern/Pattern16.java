import java.util.Scanner;
class Pattern16
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of row to Print Pattern:");
		int num = scan.nextInt();
		printStar(num);
	}

	static void printStar(int num){
		int colPrint=num-1;
		System.out.println("Pattern is printed below:\n");
		for (int row=1; row<=num; row++ )
		{
			int temp=row;
			for (int col=row; col>=1; col--)
			{
				System.out.print(row+" ");
				row=row+colPrint;
				colPrint--;
			}
			row=temp;
			colPrint=num-1;
			System.out.println();
		}
	}
}
