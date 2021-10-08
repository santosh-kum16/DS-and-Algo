import java.util.Scanner;
class PrintAllPossibleSubstring 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String s=scan.next();
		for (int ls=1;ls<=s.length() ;ls++ )
		{
			for (int i=0;i<=s.length()-ls ;i++ )
			{
				String t=s.substring(i,i+ls);
				System.out.println(t);
			}
		}
	}
}
