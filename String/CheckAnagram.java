import java.util.Arrays;
class CheckAnagram 
{
	public static void main(String[] args) 
	{
		String s1="peek";
		String s2="KeeP";
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		char ar[]=s1.toCharArray();
		char br[]=s2.toCharArray();
		Arrays.sort(ar);
		Arrays.sort(br);
		if (Arrays.equals(ar,br))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
