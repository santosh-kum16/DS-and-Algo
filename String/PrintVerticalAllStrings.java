class PrintVerticalGivenStrings 
{
	public static void main(String[] args) 
	{
		String ar[]={"TCS","WIPRO","GOOGLE","HACKERRANK","LEETCODE","HP"};
		int max=Integer.MIN_VALUE;

		for (int i=0;i<ar.length ;i++ )
		{
			if (ar[i].length()>max)
			{
				max=ar[i].length();
			}
		}
		//System.out.println(max);
		for (int i=0;i<max ;i++ )
		{
			for (int j=0;j<ar.length ;j++ )
			{
				if (i<ar[j].length()) //Checking... those(Printing) character's index should be less
										//than current string length then print... Oterwise print space
				{
					System.out.print(ar[j].charAt(i)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
