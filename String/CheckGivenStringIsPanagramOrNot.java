class CheckPanagram 
{
	public static void main(String[] args) 
	{
		String s="The quick brown fox jumps over the lazy dog";
		s=s.toUpperCase();
		s=s.replaceAll("[^A-Z]","");
		String t="";
		while (s.length()>0)
		{
			char c=s.charAt(0);
			t=t+c;
			s=s.replaceAll(""+c,"");
		}
		if(t.length()==26)
			System.out.println("Panagram");
		else
			System.out.println("Not Panagram");
	}
}
