import java.util.Scanner;
class RemoveContinuous2SameCharacter 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter String:");
		String s=scan.next();
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Initially string length is :"+sb.length()+"\n");
		for (int i=0;i<sb.length()-1 ;i++ )
		{
			
			if (sb.charAt(i)==sb.charAt(i+1))
			{
				System.out.println("\nNow start deletion of pair: "+sb+"\n");
				sb.deleteCharAt(i);
				System.out.println("deletion of first char of pair, String length is : "+sb.length());
				sb.deleteCharAt(i);
				System.out.println("deletion of second char of pair, String length is : "+sb.length());
				i=-1;
			}
		}
		System.out.println("\nNo any pair of character is left: "+sb);
	}
}
