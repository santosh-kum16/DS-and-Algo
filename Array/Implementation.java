//Below 3-ways we are Declaring ARRAY
class AyyDeclaration
{
	public static void main(String[] args) 
	{
		//Array Declaration type 1
		int ar[] = new int[5];

		//Array Declaration type 2
		int br[];
		br=new int [5];
		
		//Array Declaration type 3
		int cr[]={};
		//All 3 array are created, So printing hash code of Object reference
		System.out.println(ar+" "+br+" "+cr);
	}
}
