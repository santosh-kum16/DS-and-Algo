import java.util.Scanner;
class Array2D 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dta in Array:");
		int ar[][]=new int[3][2];
		for (int i=0;i<ar.length;i++ )
		{
			for (int j=0;j<ar[0].length ;j++ )
			{
				ar[i][j]=scan.nextInt();
			}
		}
		System.out.println("Data present in array are:");
		for (int br[] : ar )
		{
			for (int data : br )
			{
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}
}
