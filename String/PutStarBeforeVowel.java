class PutStarBeforeVowel 
{
	public static void main(String[] args) 
	{
		String s="India";
		String t="";
		String vowel="aeiouAEIOU";
		for (int i=0;i<s.length();i++ )
		{
			char c=s.charAt(i);
			if (vowel.contains(""+c))
			{
				t=t+"*"+c;
			}
			else
			{
				t=t+c;
			}
		}
		System.out.println(t);
	}
}
