import java.util.Arrays;
class ArraySort 
{
	public static void main(String[] args) 
	{
		int ar[]={9,4,2,8,6,3};
		System.out.println("Before sorting ARRAY data: "+Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("After sorting ARRAY data: "+Arrays.toString(ar));
	}
}
