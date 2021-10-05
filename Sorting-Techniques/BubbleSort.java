import java.util.Arrays;
class BubbleSort 
{
	public static void main(String[] args) 
	{
		int data [] = {2,5,1,9,5,0,6};
		int len = data.length;
		for (int i=0; i<len ;++i )
		{
			for (int j=i+1; j<len ; ++j )
			{
				if (data[i] > data[j])
				{
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.print("Sorted data: "+Arrays.toString(data));
	}
}
