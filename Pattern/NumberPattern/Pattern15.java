import java.util.Scanner;
class Pattern15
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
		int count=1;
		for (int row=0; row<num; row++ )
		{
			for (int col=0; col<num; col++  )
			{
				if (count%2==1)
				{
					System.out.print("1 ");
				}else
					System.out.print("0 ");
				count++;
			}
			System.out.println();
		}
	}
}
