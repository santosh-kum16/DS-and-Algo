import java.util.Scanner;
class NextpalindromicNumberFromGivennumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scan.nextInt();
		for ( input = input+1; ;input++ )
		{
			int rem=0;
			int temp=input;
			int sum=0;
			while (temp>0)
			{
				rem=temp%10;
				sum=sum*10+rem;
				temp=temp/10;
			}
			if (sum==input)
			{
				System.out.println(sum);
				break;
			}
		}
	}
}
