import java.util.Scanner;
class FindMaxValueAndIndexNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of ARRAY:");
		int ar[]=new int[scan.nextInt()];
		System.out.println("Enter the element in array:");
		
		//Inserting the data into Array
		for (int i=0;i<ar.length ;i++ )
		{
			ar[i]=scan.nextInt();
		}

		//Searching Maximum value in Array
		int max=Integer.MIN_VALUE;
		int index=-1;
		for (int i=0;i<ar.length ;i++ )
		{
			if (ar[i]>max)
			{
				max=ar[i];
				index=i+1;

			}
		}
		System.out.println("Maximum value are: "+max+" and its position in Array is: "+index);

	}
}
