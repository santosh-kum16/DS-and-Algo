import java.util.Scanner;
class Pattern13
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
		//Upper half of Pattern
		for (int row=1; row<=num; row++ )
		{
			for (int sp=1; sp<row ;sp++ )
			{
				System.out.print(" ");
			}
			for (int col=row; col<=num; col++  )
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		//Lower half of Pattern
		for (int row=num-1; row>=1; row-- )
		{
			for (int sp=row-1; sp>=1 ; sp-- )
			{
				System.out.print(" ");
			}
			for (int col=row; col<=num; col++  )
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
