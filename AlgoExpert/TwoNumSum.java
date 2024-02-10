import java.util.Arrays;
class TwoNumSum 
{
	public static void main(String[] args) 
	{
		int targetSum=2;
		int arr[]={8,9,-8,-7,-2,1,4,1,6};
		twoNumSum(targetSum,arr);
	}
	static void twoNumSum(int targetSum,int []arr)
	{
		int left=0;
		int right=arr.length-1;
		int currentSum;
		Arrays.sort(arr);
		System.out.println("Sorted data are: ");
		for (int data: arr )
		{
			System.out.print(data+" ");
		}
		System.out.println();
		int k=0;
		int result[]=new int[arr.length];
	    while(left<right)
		{
			currentSum=arr[left]+arr[right];
			if (currentSum==targetSum)
			{
				result[k++]=arr[left];
				result[k++]=arr[right];
				left++;
			}
			else if (currentSum<targetSum)
				left+=1;
			else if (currentSum>targetSum)
				right-=1;
		}
		System.out.println("Below pair of element are equal to target sum:");
		for (int i=0;i<k;i++ )
		{
			System.out.print(result[i]+" ");
			if(i%2!=0)
				System.out.print(", ");
		}
		System.out.println();
	}
}
