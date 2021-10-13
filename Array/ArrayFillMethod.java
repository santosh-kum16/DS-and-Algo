import java.util.Arrays;
class ArrayFillMethod 
{
	public static void main(String[] args) 
	{
		int ar[]={2,6,4,9,6,0,1,7};
		
		//Filled specific part of Array with -9
		Arrays.fill(ar,2,6,-9);
		String p = Arrays.toString(ar);
		System.out.println("Filled specific part of array with -9: "+p);

		//Filled complete Array with -8
		Arrays.fill(ar,-8);
		String s =Arrays.toString(ar);
		System.out.println("Filled complete array with -8: "+s);
	}
}
