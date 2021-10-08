import java.util.Scanner;
class RemoveUnwantedSpaces 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s=scan.nextLine();
		String t="";
		for (int i=0;i<s.length() ;i++ )
		{
			if (!(s.charAt(i)==' '))
			{
				t=t+s.charAt(i);
			}
			else if (s.charAt(i)==' '&& !(s.charAt(i+1)==' '))
			{
				t=t+" ";
			}
		}
		System.out.println(t);
	}
}
