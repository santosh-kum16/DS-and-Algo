import java.util.*;
class ThreeNumSum 
{
	public static void main(String[] args) 
	{
		int triplet[]={12,3,1,2,-6,5,-8,6};
		int targetSum=0;
		threeNumSum(triplet,targetSum);
	}
	static void threeNumSum(int []triplet,int targetSum)
	{
		Arrays.sort(triplet);
		//System.out.println(Arrays.toString(triplet));
		ArrayList al = new ArrayList(); 
		int k=0;
		for (int i=0;i<triplet.length-2 ;i++ )
		{
			int left=i+1;
			int right=triplet.length-1;
			while (left<right)
			{
				int currentSum=triplet[i]+triplet[left]+triplet[right];
				if (currentSum==targetSum)
				{
					al.add(triplet[i]);
					al.add(" ");
					al.add(triplet[left]);
					al.add(" ");
					al.add(triplet[right]);
					al.add(",  ");
				}
				if (currentSum<targetSum)
				{
					left++;
				}
				else
				{
					right--;
				}
			}
		}
		for (Object data:al )
		{
			System.out.print(data);
		}
	}
}
