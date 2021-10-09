class DeleteAllNumericValue 
{
	public static void main(String[] args) 
	{
		String str = "sd23V$92fm";
		String strWithoutNumber="";
		int strLen = str.length();
		for (int i=0 ; i<strLen ; i++ )
		{
			char c = str.charAt(i);
			if (!( c >='0' && c <='9'))
				strWithoutNumber = strWithoutNumber + c;
		}
		System.out.println("Actual String: "+str);
		System.out.println("After removing numeric: "+strWithoutNumber);
	}
}
