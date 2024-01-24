import java.util.Arrays;
class PrintNumberOfLettersInString 
{
	public static void main(String[] args) 
	{
		String s="tbbaatbacy";
		char ar[]=s.toCharArray();
		Arrays.sort(ar);
		String y=new String(ar);
		String x="";
		for (int i=0;i<s.length() ;i++ )
		{
			if (x.contains(""+s.charAt(i)))
			{
			}
			else
			{
				x=x+s.charAt(i);
			}
		}
		String t="";
		for (int i=0;i<x.length() ;i++ )
		{
			char c=x.charAt(i);
			int occ=y.lastIndexOf(c)-y.indexOf(c)+1;
			t=t+c+" = "+occ+" times\n";
		}
		System.out.println(t);
	}
}
