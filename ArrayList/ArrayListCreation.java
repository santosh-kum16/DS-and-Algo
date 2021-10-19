import java.util.ArrayList;
class ArrayListsCreation
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("hi");
		list.add(true);
		list.add(10.2);
		System.out.println(list);
		System.out.println(list.size());
		for (int i=0;i<list.size() ;i++ )
		{
			System.out.println(list.get(i));
		}
	}
}
