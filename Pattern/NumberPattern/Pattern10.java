import java.util.Scanner;
class Pattern10
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
		//Printing first half
		for (int row=0; row<num; row++ )
		{
			for (int space=1; space<=row*2 ;space++ )
			{
				System.out.print("  ");
			}
			for (int col=row; col<num; col++  )
			{
				System.out.print(col+1+" ");
			}
			System.out.println();
		}
		//Printing second half
		for (int row=num-1; row>=1 ; row-- )
		{
			for (int space=1; space<=(row-1)*2 ;space++ )
			{
				System.out.print("  ");
			}
			for (int col=row; col<=num; col++  )
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
