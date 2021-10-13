import java.util.Arrays;
class ArraySortSpecificPart 
{
	public static void main(String[] args) 
	{
		int ar[]={3,6,1,7,2,9,4,6};

		//Converting array to toString
		String s = Arrays.toString(ar);
		System.out.println("Given Array element is: "+s);

		//Sorting specific part of given array
		Arrays.sort(ar,2,6);
		String p = Arrays.toString(ar);
		System.out.println("Specific part sorted of given array is: "+p);

		//Sorting GivenArray
		Arrays.sort(ar);
	    String t = Arrays.toString(ar);
		System.out.println("Sorted Array is: "+t);

		
	}
}
