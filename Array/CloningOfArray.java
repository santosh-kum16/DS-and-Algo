class CopyArrayValueUsingInbuiltMethod 
{
	public static void main(String[] args) 
	{
		int ar[]={1,4,2,7,3,9};
		//Here we are cloning the Array
		int br[] = ar.clone();
		ar[0]=99;
		for (int data :ar )
		{
			System.out.print(data+" ");
		}
		System.out.println();
		for (int data : br )
		{
			System.out.print(data+" ");
		}
		System.out.println();
	}
}
