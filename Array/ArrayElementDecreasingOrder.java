class ArrayElementDecreasingOrder 
{
	public static void main(String[] args) 
	{
		//Array Declaration and Initialisation
		int ar[]={10,50,20,70,40};

		//Sorting array Element in Decreasing Order
		for (int i=0;i<ar.length-1 ;i++ )
		{
			if (ar[i]<ar[i+1])
			{
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
				i=-1;
			}
		}

		//For printing array element
		for (int i=0;i<ar.length ;i++ )
		{
			System.out.println(ar[i]);
		}
	}
}
